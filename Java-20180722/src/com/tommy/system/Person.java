package com.tommy.system;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-22 12:54
 * @Class_Desp:
 */
public class Person {
    public void finalize() {
        System.out.println("收取垃圾");
    }
}
