package com.brique.admcapi.service;

import com.brique.admcapi.dao.UserDao;
import com.brique.admcapi.dto.UserDto;
import com.brique.admcapi.exception.UsernameNotFoundException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UserDao userDao;

    public CustomUserDetailsService(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserDto loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDto userDto = userDao.selectUser(username);
        if (userDto == null)
            throw new UsernameNotFoundException("User does not exist.");
        userDto.setRoles(userDao.selectRole(username));
        return userDto;
    }
}
