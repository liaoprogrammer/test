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
    }
}
