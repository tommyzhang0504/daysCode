package com.tommy.integer.string01;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-19 13:56
 * @Class_Desp:
 */
public class StringDemo {
    public static void main(String[] args) {
        //计算一个字符串中，大写字母的个数，小写字母的个数，数字的个数
        String str = "How are you doing? Where do you come from, are you 24 YEARS old now? Can you count from 1 to 100?";

        //char c = str.charAt(4);
        //System.out.println(c);
        new StringDemo().getCount(str);
    }

    public void getCount(String string) {
        int upperLetter = 0;
        int lowerLetter = 0;
        int number = 0;

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            //char与int进行计算时，自动提升为int类型 65-90是大写字母；97-122是小写字母；48-57是数字
            //记不住没有关系，直接写'A'-'Z',自动换算成int类型进计算
            if (c >= 'A' && c <= 90) {
                upperLetter++;
            } else if (c >= 97 && c <= 'z') {
                lowerLetter++;
            } else if (c >= 48 && c <= '9') {
                number++;
            }
        }
        System.out.println("这个字符串有大写字母："+upperLetter+"个，有小写字母"+lowerLetter+"个，有数字"+number+"个");
    }
}
