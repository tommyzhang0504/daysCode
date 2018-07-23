package com.tommy.system;

import javax.sound.midi.Soundbank;
import java.util.Properties;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-22 12:54
 * @Class_Desp:
 */
public class SystemDemo01 {
    public static void main(String[] args) {
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        System.gc();
        System.out.println("gc已经执行");
        Properties properties = System.getProperties();
        System.out.println(properties);

    }
}
