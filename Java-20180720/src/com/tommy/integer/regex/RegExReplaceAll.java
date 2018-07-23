package com.tommy.integer.regex;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-20 10:52
 * @Class_Desp:
 */
public class RegExReplaceAll {
    public static void main(String[] args) {
        String string = "hello world 123456, how are you doing 654321";
        String replace = string.replace('1', '#');
        String s = string.replaceAll("[0-9]", "*");
        String s1 = string.replaceAll("[\\d]+", "*");

        System.out.println(replace);
        System.out.println(s);
        System.out.println(s1);
    }
}
