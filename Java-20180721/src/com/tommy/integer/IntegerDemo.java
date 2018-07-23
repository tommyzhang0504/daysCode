package com.tommy.integer;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-22 00:22
 * @Class_Desp:
 */
public class IntegerDemo {
    public static void main(String[] args) {
        int i = Integer.parseInt("123");
        int i1 = Integer.parseInt("123", 8);

        String s = Integer.toString(5,2);

        System.out.println(s);
        System.out.println(i);
        System.out.println(i1);

    }
}
