package com.api;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test {
    public static void main(String[] args) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        int year = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(year);
        System.out.println("第一次修改");
        System.out.println("第二次修改");
        System.out.println("hot-fix");
        System.out.println("hot-fixtest");

    }
}
