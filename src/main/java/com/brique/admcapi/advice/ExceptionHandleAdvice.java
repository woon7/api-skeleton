package com.brique.admcapi.advice;

import com.brique.admcapi.dto.ResponseDto;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandleAdvice {
    @ExceptionHandler(Exception.class)
    protected ResponseDto handleException(Exception e)
    {
        return new ResponseDto().setSuccess(false).setErrorMessage(e.getMessage());
    }
}
