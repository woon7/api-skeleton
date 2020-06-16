package com.brique.admcapi.controller;

import com.brique.admcapi.dto.ResponseDto;
import com.brique.admcapi.exception.AccessDeniedException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/exception")
@ApiIgnore
public class ExceptionController {
    @GetMapping("/entrypoint")
    public ResponseDto entryPoint() {
        throw new AccessDeniedException("Invalid authentication.");
    }

    @GetMapping("/accessdenied")
    public ResponseDto accessDenied() {
        throw new AccessDeniedException("More authority is needed.");
    }
}
