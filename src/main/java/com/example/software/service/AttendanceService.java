package com.example.software.service;

import com.example.software.domain.dto.AttendanceDto;

public interface AttendanceService {

    int SignIn(AttendanceDto attendanceDto);
}
