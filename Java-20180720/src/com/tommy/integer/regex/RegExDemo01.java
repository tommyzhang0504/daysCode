package com.tommy.integer.regex;

import com.sun.org.apache.xml.internal.dtm.ref.sax2dtm.SAX2DTM2;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-20 09:58
 * @Class_Desp:
 */
public class RegExDemo01 {
    public static void main(String[] args) {
        String string = "11-33-55-77-99";
        String string1 = "22  44  66  88  00";
        String string3 = "192.168.128.255";

        //System.out.println(splitSpring(string));
        //System.out.println(splitSpring(string1));
        System.out.println(splitSpring(string3));
    }

    public static String splitSpring(String string) {
        /*String[] split1 = string.split("-");
        String[] split2 = string.split("[ ]+");
        String[] split = split1.length > split2.length ? split1 : split2;*/

        //"\\."对"."进行转义，比如切割192.168.128.255，
        // 如果不转义直接用"."切割，那么"."在正则里代表任意，那字符串将被切成渣子，切成空字符数组
        String[] split = string.split("//.");
        System.out.println("这个数组的长度是" + split.length);
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        if (split.length == 0) {
            builder.append("]");
        }
        for (int i = 0; i < split.length; i++) {
            if (i == split.length - 1 ) {
                builder.append(split[i] + "]");
            } else {
                builder.append(split[i] + ",");
            }
        }
        return builder.toString();
    }
}
