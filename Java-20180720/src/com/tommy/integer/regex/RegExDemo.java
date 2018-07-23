package com.tommy.integer.regex;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-20 09:50
 * @Class_Desp:
 */
public class RegExDemo {
    public static void main(String[] args) {
        String qq0 ="12345678901213";
        String qq1 = "012345";
        String qq2 = "1234";
        String qq3 = "102345";
        System.out.println(checkQQ(qq0)+" "+checkQQ(qq1)+" "+checkQQ(qq2)+" "+checkQQ(qq3));
    }

    public static boolean checkQQ(String QQ) {
        return QQ.matches("[123456789][\\d]{5,12}");
    }
}
