package com.brique.admcapi.service;

import com.brique.admcapi.config.security.JwtTokenProvider;
import com.brique.admcapi.dao.UserDao;
import com.brique.admcapi.dto.ResponseDto;
import com.brique.admcapi.dto.UserDto;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class UserService {
    private final UserDao userDao;
    private final JwtTokenProvider jwtTokenProvider;
    private final PasswordEncoder passwordEncoder;
    private final CustomUserDetailsService customUserDetailsService;

    public UserService(UserDao userDao, JwtTokenProvider jwtTokenProvider, PasswordEncoder passwordEncoder, CustomUserDetailsService customUserDetailsService) {
        this.userDao = userDao;
        this.jwtTokenProvider = jwtTokenProvider;
        this.passwordEncoder = passwordEncoder;
        this.customUserDetailsService = customUserDetailsService;
    }

    public ResponseDto signIn(String username, String password) {
        UserDto userDto = customUserDetailsService.loadUserByUsername(username);
        if (!passwordEncoder.matches(password, userDto.getPassword()))
            throw new InvalidParameterException("Incorrect password.");
        return new ResponseDto().setData(jwtTokenProvider.createToken(userDto.getUsername(), userDto.getRoles()));
    }

    public ResponseDto signUp(String username, String password, String nickname) {
        Map<String, Object> userMap = new HashMap<>();
        userMap.put("username", username);
        userMap.put("password", passwordEncoder.encode(password));
        userMap.put("nickname", nickname);
        userDao.insertUser(userMap);
        Map<String, Object> roleMap = new HashMap<>();
        roleMap.put("username", username);
        roleMap.put("rolename", "ROLE_USER");
        userDao.insertRole(roleMap);
        return new ResponseDto().setData("Registration Successful.");
    }
}
