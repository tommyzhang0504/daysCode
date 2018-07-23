package com.tommy.integer.regex;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-21 08:07
 * @Class_Desp:
 */
public class RegExEmail {
    public static void main(String[] args) {
        String email = "hotmail_0504@sina.com.cn";
        String email2 = "hotmail_0504@163.com";
        System.out.println(new RegExEmail().checkEmail(email));
        System.out.println(new RegExEmail().checkEmail(email2));
    }

    public boolean checkEmail(String email) {
        return email.matches("[\\w]+@[\\da-zA-Z]+(\\.[a-zA-Z]+)+");
    }
}
