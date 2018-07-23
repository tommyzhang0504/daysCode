package com.tommy.date;

import com.sun.scenario.animation.shared.CurrentTime;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import sun.java2d.pipe.SpanShapeRenderer;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: tommy.zhang     * @Created_Date: 2018-07-21 18:34
 * @Class_Desp:
 */
public class DateDemo01 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date.getTime());
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(new Date());

        Date parse = simpleDateFormat.parse("2002-7-7 9:0:0");
        System.out.println(parse);
        System.out.println(format);
    }
}
