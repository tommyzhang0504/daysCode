package com.tommy.bigdecimal;

import com.sun.org.glassfish.external.statistics.BoundaryStatistic;

import java.math.BigDecimal;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-22 21:09
 * @Class_Desp:
 */
public class MyBigDecimal {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("12131231.123123123");
        BigDecimal bigDecimal2 = new BigDecimal("22222222.222222222");

        BigDecimal add = bigDecimal1.add(bigDecimal2);
        System.out.println(add);

        BigDecimal b3 = new BigDecimal("1.00");
        BigDecimal b4 = new BigDecimal("0.32");

        BigDecimal subtract = b3.subtract(b4);
        System.out.println(subtract);

        BigDecimal multiply = b3.multiply(b4);
        System.out.println(multiply);

        BigDecimal b5 = new BigDecimal("1.349");
        BigDecimal b6 = new BigDecimal("100");
        BigDecimal divide = b5.divide(b6);
        BigDecimal divide1 = b5.divide(b6, 3, BigDecimal.ROUND_HALF_UP);
        System.out.println(divide);
        System.out.println(divide1);
    }
}
