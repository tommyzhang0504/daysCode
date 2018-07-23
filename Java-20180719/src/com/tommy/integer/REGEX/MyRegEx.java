package com.tommy.integer.REGEX;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-19 16:43
 * @Class_Desp:
 */
public class MyRegEx {
    public static void main(String[] args) {
        String regEx = "[0-9]{6,12}";
        String s10 ="12345";
        String s11 ="123456";
        String s21 ="012345678912";
        String s22 = "0123456789123";
        boolean b1 = s10.matches(regEx);
        boolean b2 = s11.matches(regEx);
        boolean b3 = s21.matches(regEx);
        boolean b4 = s22.matches(regEx);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
    }
}
