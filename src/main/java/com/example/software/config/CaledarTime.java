package com.example.software.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Service
public class CaledarTime {

    private static String dt1 = "00:00:00";
    private static String dt2 = "10:00:00";
    private static String dt3 = "05:00:00";
    private static String dt4 = "06:00:00";
    private static String dt5 = "12:00:00";
    private static String dt6 = "00:00:00";

    public int  checkTime(Date signIn){
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        {
            try {
                Date begTime = format.parse(dt1);
                Date endTime = format.parse(dt2);
                Date begTime1 = format.parse(dt3);
                Date endTime1 = format.parse(dt4);
                Date partTime = format.parse(dt5);
                Date updateTime = format.parse(dt6);
                if( signIn.getTime() < endTime.getTime() && signIn.getTime()>begTime.getTime()){
                    return 1;
                }else if(signIn.getTime() > endTime.getTime() && signIn.getTime() < partTime.getTime()){
                    return 2;
                }else if(signIn.getTime()<partTime.getTime() && signIn.getTime()>begTime1.getTime()){
                    return 3;
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }return 0;

    }
}
