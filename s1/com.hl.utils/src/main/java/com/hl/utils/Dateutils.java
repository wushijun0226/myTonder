package com.hl.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateutils {

    public static String datetostring(Date date,String format){
        String dates = new SimpleDateFormat(format).format(date);
        return dates;
    }
    public static Date Stringtodate(String date,String format) throws ParseException {
        Date dates = new SimpleDateFormat(format).parse(date);
        return dates;
    }
}
