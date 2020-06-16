package com.brique.admcapi.advice;

import com.brique.admcapi.dto.ResponseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandleAdvice {
    Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

    @ExceptionHandler(Exception.class)
    protected ResponseDto handleException(Exception e)
    {
        logger.error(e.getMessage());
        return new ResponseDto().setSuccess(false).setErrorMessage(e.getMessage());
    }
}
