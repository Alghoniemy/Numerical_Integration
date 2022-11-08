package com.company;

//developed by Abdullah Alghoniemy
//11/2022
import java.text.DecimalFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        double xC = 0;
        double yC = 0;
        double x = 0;
        double y = 0;
        double f = 0;
        int m = 0;
        int n = 0;
        DecimalFormat df = new DecimalFormat("0.0");

        while (count <= 10) {
            x = generate_X();
            y = generate_Y();
            y= y/100 ;
            xC = x / 10;
            yC = y * 140;
            f = Math.pow(xC, 3);
            n++;
            if (f >= yC)
                m++;

            System.out.println("N# " + count + "| RandomNumber for X : " + x + "| X Coordinate : " + xC + "| RandomNumber for Y : " + y
                    + " | Y Coordinate : " + df.format(yC) + "| X^3 : " + df.format(f) + " | M : " + m + " | N : " + n);


            count++;
        }


    }
    public static int generate_X() {
        Random random_number = new Random();
        return random_number.nextInt(20, 50);
    }

    public static int generate_Y() {
        Random random_number = new Random();
        return random_number.nextInt(100);
    }


}
