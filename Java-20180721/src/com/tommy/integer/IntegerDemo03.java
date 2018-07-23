package com.tommy.integer;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-22 11:53
 * @Class_Desp:
 */
public class IntegerDemo03 {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);
        System.out.println(i.equals(j));
        System.out.println();


        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);
        System.out.println(a.equals(b));
        System.out.println();

        Short x = 127;
        Short y = 127;
        System.out.println(x == y);
        System.out.println(x.equals(y));
        System.out.println();

        Integer l = 128;
        Integer m = 128;
        System.out.println(l == m);
        System.out.println(l.equals(m));

    }
}
