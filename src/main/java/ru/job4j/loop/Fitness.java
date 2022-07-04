package ru.job4j.loop;

import java.sql.SQLOutput;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            nik *= 2;
            ivan *= 3;
            month++;
        }
        return month;

    }
}
