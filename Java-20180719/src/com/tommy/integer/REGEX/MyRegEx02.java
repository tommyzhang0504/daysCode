package com.tommy.integer.REGEX;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-19 17:21
 * @Class_Desp:
 */
public class MyRegEx02 {
    public static void main(String[] args) {
        String regEx = "a*b";
        String string = "aaaaaaab";
        String string2 = "aaaaaabc";
        String string3 = "b";
        System.out.println(string.matches(regEx));
        System.out.println(string2.matches(regEx));
        System.out.println(string3.matches(regEx));
    }
}
