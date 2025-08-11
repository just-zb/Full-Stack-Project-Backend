package com.michael.fullstackprojectbackend.exception;

import com.michael.fullstackprojectbackend.enums.ResultCodeEnum;
import lombok.Getter;

@Getter
public class SystemException extends RuntimeException {
    private final ResultCodeEnum resultCodeEnum;

    public SystemException() {
        super(ResultCodeEnum.SYSTEM_EXCEPTION.getMessage());
        this.resultCodeEnum = ResultCodeEnum.SYSTEM_EXCEPTION;
    }

    public SystemException(ResultCodeEnum resultCodeEnum) {
        super(resultCodeEnum.getMessage());
        this.resultCodeEnum = resultCodeEnum;
    }
}
