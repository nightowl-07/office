package com.example.software.mapper;

import com.example.software.domain.entity.Attendance;

public interface AttendanceMapper {
    int deleteByPrimaryKey(Integer atteno);

    int insert(Attendance record);

    int insertSelective(Attendance record);

    Attendance selectByPrimaryKey(Integer atteno);

    int updateByPrimaryKeySelective(Attendance record);

    int updateByPrimaryKey(Attendance record);
}