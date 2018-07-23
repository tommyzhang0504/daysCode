package com.tommy.system;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-22 12:10
 * @Class_Desp:
 */
public class SystemDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
