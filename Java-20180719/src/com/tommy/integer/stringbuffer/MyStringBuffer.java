package com.tommy.integer.stringbuffer;

import java.util.ArrayList;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-19 15:06
 * @Class_Desp:
 */
public class MyStringBuffer {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append(6).append(false).append("hello abc");
        System.out.println(buffer);

        //java里面一般是包头，不包尾的数字
        buffer.delete(0,buffer.length()-3).delete(0,buffer.length()-2);
        //System.out.println(buffer);

        MyStringBuffer myBuffer = new MyStringBuffer();
        StringBuffer buffer01 = new StringBuffer();
        buffer01.append("哈哈");
        ArrayList arrayList = new ArrayList();
        arrayList.add("helloworld");
        ArrayList array  = new ArrayList();
        array = null;
        myBuffer.myInsert(buffer01,arrayList).insert(buffer01.length()-1,array);
        System.out.println(buffer01);
        buffer01.reverse();
        System.out.println(buffer01);
    }

    public StringBuffer myInsert(StringBuffer buffer, Object object) {
        if (object!=null) {
            buffer.insert(1,object);
        }
        return buffer;
    }
}