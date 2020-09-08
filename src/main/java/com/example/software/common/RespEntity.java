package com.example.software.common;


import lombok.Data;

/**
 * "返回信息"的封装类
 */
@Data
public class RespEntity<T> {
    /**
     * 状态码
     */
    private int status;
    /**
     * 信息
     */
    private String msg;
    /**
     * 提示语
     */
    private String tips;
    /**
     * 数据
     */
    private T data;

    //成功的响应信息

    /**
     * 不带数据的普通的成功信息
     */
    public static RespEntity success() {
        RespEntity<Object> noDateCommon = new RespEntity<Object>();
        noDateCommon.setStatus(RespCode.SUCCESS.status);
        noDateCommon.setMsg(RespCode.SUCCESS.msg);
        noDateCommon.setTips(RespCode.SUCCESS.tips);
        return noDateCommon;
    }

    /**
     * 带数据的普通的成功信息
     */
    public static <T> RespEntity success(T data) {
        RespEntity<T> dateResp = new RespEntity<T>();
        dateResp.setStatus(RespCode.SUCCESS.status);
        dateResp.setMsg(RespCode.SUCCESS.msg);
        dateResp.setTips(RespCode.SUCCESS.tips);
        dateResp.setData(data);
        return dateResp;
    }

    /**
     * 不带数据的可变的成功信息
     */
    public static RespEntity success(RespCode respCode) {
        RespEntity<Object> noDateChange = new RespEntity<Object>();
        noDateChange.setStatus(respCode.status);
        noDateChange.setMsg(respCode.msg);
        noDateChange.setTips(respCode.tips);
        return noDateChange;
    }

    /**
     * 带数据的可变的成功信息
     */
    public static <T> RespEntity success(RespCode respCode, T data) {
        RespEntity<T> DateChange = new RespEntity<T>();
        DateChange.setStatus(respCode.status);
        DateChange.setMsg(respCode.msg);
        DateChange.setTips(respCode.tips);
        DateChange.setData(data);
        return DateChange;
    }

    //失败的响应信息

    /**
     * 普通的失败信息
     */
    public static RespEntity error() {
        RespEntity<Object> noDateErrorRespEntity = new RespEntity<Object>();
        noDateErrorRespEntity.setStatus(RespCode.ERROR.status);
        noDateErrorRespEntity.setMsg(RespCode.ERROR.msg);
        noDateErrorRespEntity.setTips(RespCode.ERROR.tips);
        return noDateErrorRespEntity;
    }
    /**
     * 可变的失败信息
     */
    /**
     * 不带数据的可变的成功信息
     */
    public static RespEntity error(RespCode respCode) {
        RespEntity<Object> noDateChange = new RespEntity<Object>();
        noDateChange.setStatus(respCode.status);
        noDateChange.setMsg(respCode.msg);
        noDateChange.setTips(respCode.tips);
        return noDateChange;
    }
}
