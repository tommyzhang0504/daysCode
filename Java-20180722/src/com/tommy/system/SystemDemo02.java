package com.tommy.system;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-22 13:18
 * @Class_Desp:
 */
public class SystemDemo02 {
    public static void main(String[] args) {
        int[] array01 = {11, 33, 55, 77, 99};
        int[] array02 = {22, 44, 66, 88, 10};

        System.arraycopy(array01, 0, array02, 1, 4);

        for (int i = 0; i < array02.length  ; i++) {
            System.out.print(array02[i]+" ");
        }
    }
}
