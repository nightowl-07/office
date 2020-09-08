package com.example.software.service.impl;

import com.example.software.config.CaledarTime;
import com.example.software.domain.dto.AttendanceDto;
import com.example.software.service.AttendanceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AttendanceServiceImpl implements AttendanceService {
    @Resource
    CaledarTime caledarTime;

    @Override
    public int SignIn(AttendanceDto attendanceDto) {
        int count = caledarTime.checkTime(attendanceDto.getSignIn());
        return 0;
    }
}
