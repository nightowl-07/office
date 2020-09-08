package com.example.software.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Emp {
    /**
    * 员工编号
    */
    private Integer empno;

    /**
    * 员工姓名
    */
    private String ename;

    /**
    * 员工岗位
    */
    private String job;

    /**
    * 员工直属领导编号
    */
    private Integer mgr;

    /**
    * 员工入职时间
    */
    private Date hiredate;

    /**
    * 员工工资
    */
    private Integer sal;

    /**
    * 员工奖金
    */
    private Integer comm;

    /**
    * 部门编号
    */
    private Integer deptno;
}