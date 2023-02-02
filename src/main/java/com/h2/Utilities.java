package com.h2;

public class Utilities {
    public static long getLongValue(String in) {
        long out = Long.MIN_VALUE;

        try {
            out = Long.parseLong(in);
        } catch (NumberFormatException e) {
            System.out.println(in + " cannot be converted into a 'long' value. Exiting program.");
        }

        return out;
    }

    public static int getIntValue(String in) {
        int out = 0;

        try {
            out = Integer.parseInt(in);
        } catch (NumberFormatException e) {
            System.out.println(in + " cannot be converted into a 'float' value. Exiting program.");
        }
        return out;
    }
}
