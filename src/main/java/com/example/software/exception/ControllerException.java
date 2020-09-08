package com.example.software.exception;

import com.example.software.common.RespCode;
import lombok.Data;

/**
 * "controller"层的异常类
 */
@Data
public class ControllerException extends Exception {
    /**
     * 异常状态码
     */
    private int status;
    /**
     * 异常信息
     */
    private String msg;
    /**
     * 异常提醒
     */
    private String tip;

    public ControllerException(RespCode respCode) {
        this.status = respCode.getStatus();
        this.msg = respCode.getMsg();
        this.tip = respCode.getTips();
    }
}
