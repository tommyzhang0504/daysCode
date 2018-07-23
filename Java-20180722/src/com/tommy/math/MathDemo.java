package com.tommy.math;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-22 13:49
 * @Class_Desp:
 */
public class MathDemo {
    public static void main(String[] args) {
        int abs = Math.abs(-9);
        System.out.println(abs);

        double ceil = Math.ceil(9.5);
        System.out.println(ceil);

        double floor = Math.floor(-9.4);
        System.out.println(floor);

        double sqrt = Math.sqrt(9);
        System.out.println(sqrt);

        long round = Math.round(7.4);
        long round1 = Math.round(7.5);
        System.out.println(round);
        System.out.println(round1 );
    }
}
