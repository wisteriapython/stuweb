package com.yujian.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static Date string2Date(String strDate,String partten){
        SimpleDateFormat sd=new SimpleDateFormat(partten);
        Date date=null;
        try {
            date=sd.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
