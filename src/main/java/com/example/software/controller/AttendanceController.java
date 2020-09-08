package com.example.software.controller;

import com.example.software.common.RespCode;
import com.example.software.common.RespEntity;
import com.example.software.domain.dto.AttendanceDto;
import com.example.software.service.AttendanceService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {
    @Resource
    private AttendanceService attendanceService;

    @GetMapping("/signin")
    public RespEntity Signin(AttendanceDto attendance){
        int count  = attendanceService.SignIn(attendance);
        attendance.getSignIn();

        return RespEntity.success(RespCode.SUCCESS);
    }
}
