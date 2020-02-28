package com.ua.okono;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ReturnDate {
    public Date time;
    public int day;

    public Date getTime (){
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        this.time = gregorianCalendar.getTime();
        this.day = gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println(time);
        System.out.println(day);
        return time;

    }

}
