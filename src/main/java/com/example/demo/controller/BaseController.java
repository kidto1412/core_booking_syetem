package com.example.demo.controller;

import com.example.demo.constant.BaseResponse;
import com.example.demo.constant.GlobalMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
@Slf4j
public class BaseController {

    public static BaseResponse<?> buildSuccessResponse(Object data) {
        return BaseResponse.builder().code(GlobalMessage.SUCCESS.code).message(GlobalMessage.SUCCESS.message).data(data)
                .build();
    }

}