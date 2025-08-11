package com.michael.fullstackprojectbackend.exception;

import com.michael.fullstackprojectbackend.enums.ResultCodeEnum;
import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException{
    private final ResultCodeEnum resultCodeEnum;

    public BusinessException() {
        super(ResultCodeEnum.BUSINESS_EXCEPTION.getMessage());
        this.resultCodeEnum = ResultCodeEnum.BUSINESS_EXCEPTION;
    }

    public BusinessException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.resultCodeEnum = resultCodeEnum;
    }

}
