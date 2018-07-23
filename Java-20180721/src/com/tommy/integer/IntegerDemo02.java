package com.tommy.integer;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-22 11:33
 * @Class_Desp:
 */
public class IntegerDemo02 {
    public static void main(String[] args) {
        //Integer integer = new Integer(1000);
        Integer integer = 1000;
        System.out.println(integer);
        int i = integer.intValue();
        System.out.println(i);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.toBinaryString(99));
        System.out.println(Integer.toOctalString(109));
        System.out.println(Integer.toHexString(209));

    }
}
