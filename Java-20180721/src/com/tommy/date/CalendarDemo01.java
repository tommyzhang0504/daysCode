package com.tommy.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-21 19:42
 * @Class_Desp:
 */
public class CalendarDemo01 {
    public static void main(String[] args) throws ParseException {
        /*Calendar c = Calendar.getInstance();
        //System.out.println(c);
        c.set(Calendar.YEAR, 2002);
        c.set(Calendar.MONTH, 6);
        c.set(Calendar.DAY_OF_MONTH, 7);

        c.add(Calendar.YEAR, 16);
        c.add(Calendar.MONTH, 5);

        Date date1 = c.getTime();

        String date = getDate(c);
        System.out.println(date + "~" + date1);*/

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = sdf.parse("1982-5-4");
        Date today = new Date();

        long day = getDay(birthday, today);
        System.out.println(day);


    }

    /**
     * @Author: tommy.zhang     * Date: 2018-07-21_22:02
     * @params: [calendar]
     * @return: java.lang.String
     * Method_Desc:
     */
    public static String getDate(Calendar calendar) {

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DATE);
        String date = year + "年" + month + "月" + day + "日";
        return date;
    }

    public static long getDay(Date date1, Date date2) {
        /*long l = c2.getTimeInMillis() - c1.getTimeInMillis();
        System.out.println(c1.getTimeInMillis());
        System.out.println(c2.getTimeInMillis());
        return l/3600/24/1000;*/
        long ld1 = date1.getTime();
        long ld2 = date2.getTime();
        System.out.println(ld1+"~"+ld2);
        return (ld2 - ld1) / 1000 / 60 / 60 / 24;
    }


}

