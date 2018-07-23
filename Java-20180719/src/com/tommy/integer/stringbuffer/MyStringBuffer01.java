package com.tommy.integer.stringbuffer;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-19 15:49
 * @Class_Desp:
 */
public class MyStringBuffer01 {
    public static void main(String[] args) {
        int[] arr = {22, 11, 44, 33, 55, 66, 77, 88, 99};
        String string = new MyStringBuffer01().invert(arr);
        System.out.println(string);
    }

    /**
     * @Author: tommy.zhang     * Date: 2018-07-19_15:58
     * @params: [arr]
     * @return: java.lang.String
     * Method_Desc:
     */
    private String invert(int[] arr) {
        StringBuilder buffer = new StringBuilder();
        buffer.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                buffer.append(arr[i]).append("]");
            } else {
                buffer.append(arr[i]).append(",");
            }
        }
        return buffer.toString();
    }
}
