package com.tommy.date;

import java.util.Calendar;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-22 00:19
 * @Class_Desp: 错误的程序，计算错误
 */
public class Test {
    public static void main(String[] args){
        Calendar my = Calendar.getInstance();
        Calendar c = Calendar.getInstance();
        //设置出生年月日 1995-05-10
        my.set(Calendar.YEAR, 1995);
        my.set(Calendar.MONTH, 4);
        my.set(Calendar.DATE, 10);
        //获取时间中的天数
        int day = c.get(Calendar.DATE);
        int myDay = my.get(Calendar.DATE);
        System.out.println(day - myDay);
    }

}
