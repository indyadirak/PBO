package com.dicoding.javafundamental.basic;

import com.dicoding.javafundamental.basic.kendaraan.*;
import com.dicoding.javafundamental.basic.musik.gitar;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world! yeah");
        System.out.println();
        System.out.println(" suara -suara : ");
        gitar.bunyi();
        System.out.println();
        mobil.suara();
        System.out.println();
        motor.bunyi();
        System.out.println(" ");
        System.out.println();
        System.out.println("tanggal ");
        Date today = new Date();
        System.out.println("hari ini = " + today);
        Date tomorrow = DateUtils.addDays(today,1);
        System.out.println("besok    = " + tomorrow);
    }
}