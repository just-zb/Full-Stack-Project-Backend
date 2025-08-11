package com.michael.fullstackprojectbackend.exception;

import com.michael.fullstackprojectbackend.result.ResultFormat;
import com.michael.fullstackprojectbackend.result.ResultResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ResultFormat> handleBusinessException(BusinessException e){
        log.error(e.getMessage());
        e.printStackTrace();
        return ResultResponse.error(e.getResultCodeEnum());
    }
    @ExceptionHandler(SystemException.class)
    public ResponseEntity<ResultFormat> handleSystemException(SystemException e){
        log.error(e.getMessage());
        e.printStackTrace();
        return ResultResponse.error(e.getResultCodeEnum());
    }


}
