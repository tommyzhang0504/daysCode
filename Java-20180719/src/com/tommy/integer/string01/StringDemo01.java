package com.tommy.integer.string01;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-19 14:20
 * @Class_Desp:
 */
public class StringDemo01 {
    public static void main(String[] args) {
        String str01 = "how are yOU DOing HERE";
        String ss01 = str01.substring(0, 1).toUpperCase();
        String ss02 = str01.substring(1).toLowerCase();
        String str02 = ss01 + ss02;
        System.out.println(str02);

        String string = "java, nihaojava, javajava, verygoodjava";
        String str = "java";
        int count = new StringDemo01().getCount(string, str);
        System.out.println(count);

    }

    public int getCount(String string, String str) {
        int count = 0;
        int index = 0;
        while (index>=0) {
            index = string.indexOf(str);
            if (index >= 0) {
                count++;
                string = string.substring(index + str.length());
            }
        }

        return count;
    }
}
