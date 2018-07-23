package com.tommy.date;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-21 23:46
 * @Class_Desp:
 */
public class CheckDate {
    public static void main(String[] args) {
        //对于给定的年份，判定是否其为闰年
        Calendar c = Calendar.getInstance();
        c.set(3000, 2, 1);
        Date date = c.getTime();
        System.out.println("date日期：" + date);


        System.out.println(c.get(Calendar.YEAR) + "年" + (c.get(Calendar.MONTH)+1) + "月" + c.get(Calendar.DATE));
        c.add(Calendar.DATE, -1);

        int i = c.get(Calendar.DATE);
        System.out.println(i);

    }
}
