package com.michael.fullstackprojectbackend.result;

import com.michael.fullstackprojectbackend.enums.ResultCodeEnum;
import org.springframework.http.ResponseEntity;

public class ResultResponse {

    public static ResponseEntity<ResultFormat> success(Object data){
        return ResponseEntity.ok(ResultFormat.success(data));
    }

    public static ResponseEntity<ResultFormat> error(ResultCodeEnum resultCodeEnum) {
        return ResponseEntity.badRequest().body(ResultFormat.error(resultCodeEnum));
    }
}
