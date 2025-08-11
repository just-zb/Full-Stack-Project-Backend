package com.michael.fullstackprojectbackend.exception;

import com.michael.fullstackprojectbackend.result.ResultFormat;
import com.michael.fullstackprojectbackend.result.ResultResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ResultFormat> handleBusinessException(BusinessException e){
        // TODO log here
        e.printStackTrace();
        return ResultResponse.error(e.getResultCodeEnum());
    }
    @ExceptionHandler(SystemException.class)
    public ResponseEntity<ResultFormat> handleSystemException(SystemException e){
        // TODO log here
        e.printStackTrace();
        return ResultResponse.error(e.getResultCodeEnum());
    }


}
