package com.brique.admcapi.controller;

import com.brique.admcapi.dto.ResponseDto;
import com.brique.admcapi.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/signIn")
    public ResponseDto signIn(@RequestParam String username, @RequestParam String password) {
        return userService.signIn(username, password);
    }

    @PostMapping("/signUp")
    public ResponseDto signUp(@RequestParam String username, @RequestParam String password, @RequestParam String nickname) {
        return userService.signUp(username, password, nickname);
    }
}
