package com.vesska;

public class Homework_1 {
    public static void main(String[] args) {

        byte eins = 100;
        short zwei = 2000;
        int drei = 58724;
        long vier = 486129478L;
        double fuenf = 0.1;
        float sechs = 6.6f;

        System.out.println(eins + zwei);
        System.out.println(drei - zwei);
        System.out.println(eins * fuenf);
        System.out.println(vier / sechs);
        System.out.println(vier % drei);

        System.out.println(eins > zwei);
        System.out.println(zwei < drei);
        System.out.println(vier == fuenf);
        System.out.println(sechs != eins);
        System.out.println(eins <= zwei);
        System.out.println(drei >= vier);


        int maxInt = Integer.MAX_VALUE;
        System.out.println(maxInt + 1);

        byte maxByte = Byte.MAX_VALUE;
        maxByte += maxByte;
        System.out.println(maxByte);
    }
}