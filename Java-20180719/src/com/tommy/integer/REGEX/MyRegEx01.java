package com.tommy.integer.REGEX;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-19 17:17
 * @Class_Desp:
 */
public class MyRegEx01 {
    public static void main(String[] args) {
        String regEx = "1[3456789][0-9]{9}";
        String s1 ="19821022203";
        String s2 ="12821022203";
        String s3 ="198210222030";
        boolean b = s1.matches(regEx);
        System.out.println(b);
        System.out.println(s2.matches(regEx));
        System.out.println(s3.matches(regEx));
    }
}
