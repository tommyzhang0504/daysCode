package com.tommy.arraylist;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.ArrayList;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-22 21:50
 * @Class_Desp:
 */
public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(11);
        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);
        arrayList.add(15);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i)+"~");
        }
        System.out.println(arrayList);

        ArrayList<Person> arrayPerson = new ArrayList<>();
        arrayPerson.add(new Person("张三", 24));
        arrayPerson.add(new Person("李四", 23));
        for (int i = 0; i < arrayPerson.size(); i++) {
            System.out.println(arrayPerson.get(i));
        }
        arrayPerson.clear();
        System.out.println(arrayPerson);
    }


}
