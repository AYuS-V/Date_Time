package com.dt.ayus;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello Welcome to Maven Build Tool !! Today Date and Time is: " + getLocalCurrentDateTime());
    }

    private static String getLocalCurrentDateTime() {
        // String m = "Mithun Technologies";
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMMM dd, yyyy HH:mm:ss");
        return formatter.format(new Date());
    }
}