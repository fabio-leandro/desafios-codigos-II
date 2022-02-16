package com.fabio.experiencias;

public class teste {

    public static void main(String[] args) {

        System.out.println(10/2);
        int a = 7;
        int b = 9;
        int c = 8;
        int total = a + b + c;
        double percentA = (double) a / total * 100;
        double percentB = (double) b / total;
        double percentC = (double) c / total;
        System.out.printf("%.2f", percentA);

    }
}
