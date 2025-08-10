package com.michael.fullstackprojectbackend.result;


import com.michael.fullstackprojectbackend.enums.ResultCodeEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultFormat {
    private int code;
    private String message;
    private Object data;

    public ResultFormat() {
    }

    public ResultFormat(ResultCodeEnum codeEnum, Object data) {
        this.code = codeEnum.getCode();
        this.message = codeEnum.getMessage();
        this.data = data;
    }

    public static ResultFormat success(Object data) {
        return new ResultFormat(ResultCodeEnum.SUCCESS, data);
    }
    public static ResultFormat error(ResultCodeEnum codeEnum) {
        return new ResultFormat(codeEnum, null);
    }
}
