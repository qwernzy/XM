package com.yy.Dateandecollection;

import java.util.Calendar;

public class CalenderDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        c.add(Calendar.YEAR,-44);
        c.add(Calendar.DAY_OF_YEAR,+2);
    }
}