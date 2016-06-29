package com.epam.spb.lection2;

/**
 * Created by MKlyarovich on 28.06.2016.
 */
public class Translate {

    private byte b;
    private short s;
    private int i;
    private long l;
    private double d;
    private float f;

    //Преобразованние из byte в short, int, long, double, float
    private void convertByteToFloat(byte b_in) {
        s = b_in;
        System.out.println("Преобразованное byte " +b_in+ " в short: " + s);
        i = b_in;
        System.out.println("Преобразованное byte " +b_in+ " в int: " + i);
        l = b_in;
        System.out.println("Преобразованное byte " +b_in+ " в long: " + l);
        d = b_in;
        System.out.println("Преобразованное byte " +b_in+ " в double: " + d);
        f = b_in;
        System.out.println("Преобразованное byte " +b_in+ " в float: " + f);
    }

    //Преобразованние из float в byte, short, int, long, double
    private void convertFloatToByte(float f_in) {
        d = (double) f;
        System.out.println("Преобразованное float " +f_in+ " в double: " + d);
        i = (int) f_in;
        System.out.println("Преобразованное float " +f_in+ " в int: " + i);
        l = (long) f_in;
        System.out.println("Преобразованное float " +f_in+ " в long: " + l);
        s = (short) f_in;
        System.out.println("Преобразованное float " +f_in+ " в short: " + s);
        b = (byte) f_in;
        System.out.println("Преобразованное float " +f_in+ " в byte: " + b);
    }

    public static void main(String[] args) {

        byte bbyte = 100;
        float ffloat = 100000000000000000000000000000000000000f;

        Translate translate = new Translate();
        translate.convertByteToFloat(bbyte);
        translate.convertFloatToByte(ffloat);
    }
}
