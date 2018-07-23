package com.tommy.arraylist;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-23 09:22
 * @Class_Desp:
 */
public class ArrayListContains {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("123");
        collection.add("456");
        collection.add("789");
        collection.add("123");
        //boolean contains = collection.contains("123");
        //System.out.println(contains);

        System.out.println(collection);

        //Object[] objects = collection.toArray();
        //for (int i = 0; i < objects.length; i++) {
        //    System.out.println(objects[i]);
        //}

        //System.out.println(collection.remove("123"));
        //System.out.println(collection);

        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        for (Iterator<String> it2 = collection.iterator(); it2.hasNext(); System.out.print(it2.next() + " ")) {

        }

    }
}


