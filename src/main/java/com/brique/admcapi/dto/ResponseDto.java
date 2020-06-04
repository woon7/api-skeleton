package com.brique.admcapi.dto;

public class ResponseDto {
    protected Object data;
    protected boolean success = true;
    protected String errorMessage;

    public Object getData() {
        return data;
    }

    public ResponseDto setData(Object data) {
        this.data = data;
        return this;
    }

    public boolean isSuccess() {
        return success;
    }

    public ResponseDto setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public ResponseDto setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
}
