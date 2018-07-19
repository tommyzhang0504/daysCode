package com.tommy.string;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-19 08:12
 * @Class_Desp:
 */
public class StringDemo01 {
    public static void main(String[] args) {
        String str01 = "how are you doing? do you know the situation of the issue";
        String str02 = "how";
        String str20 = "hOw";
        String str03 = "ing";
        String str04 = "汉字";

        //new StringDemo01().f01();
        System.out.println(new StringDemo01().myStartsWith(str01, str02));

        System.out.println(new StringDemo01().myEndsWith(str01, str03));

        boolean contains = str01.contains(str02);
        System.out.println(contains);

        int aDo = str01.indexOf("do");
        int i = str01.indexOf('?');
        int i1 = str01.indexOf("?");
        int am = str01.indexOf("am");
        System.out.println(aDo + "~~~" + i + "~~~" + i1 + "~~~" + am);

        byte[] bytes = str02.getBytes();
        byte[] bytes1 = str04.getBytes();
        char[] chars = str02.toCharArray();

        for (int j = 0; j < bytes.length; j++) {
            System.out.print(bytes[j]+" ");
        }
        System.out.println();
        for (int j = 0; j < bytes1.length; j++) {
            System.out.print(bytes1[j]+" ");
        }
        System.out.println();
        for (int j = 0; j < chars.length ; j++) {
            System.out.print(chars[j]+" ");
        }
        System.out.println();
        boolean equals = str02.equals(str20);
        boolean b = str02.equalsIgnoreCase(str20);
        System.out.println(equals+" "+b);

    }

    public void f01() {
        String str = "how are you doing?";
        String str00 = "how";
        String str000 = "doing";

        String str01 = str.substring(1, 1);
        String str02 = str.substring(4);
        String str03 = str.substring(4, 8);
        System.out.println("1,1" + str01 + "---" + str02 + "---" + str03);
    }

    public boolean myStartsWith(String str01, String str02) {
        boolean b = str01.startsWith(str02);
        return b;
    }

    public boolean myEndsWith(String str01, String str02) {
        boolean b = str01.endsWith(str02);
        return b;
    }


}
