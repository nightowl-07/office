package com.example.software.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Attendance {
    /**
    * 考勤编号
    */
    private Integer atteno;

    /**
    * 员工编号
    */
    private Integer empno;

    /**
    * 员工姓名
    */
    private String ename;

    /**
    * 考勤日期
    */
    private Date daterecord;

    /**
    * 签到时间
    */
    private Date signIn;

    /**
    * 签到状态0:缺卡，1：正常，2：迟到
    */
    private Integer inStatus;

    /**
    * 签退时间
    */
    private Date signOut;

    /**
    * 签退状态0:缺卡，1：正常，2：早退
    */
    private Integer outStatus;
}