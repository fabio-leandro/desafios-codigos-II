package com.fabio.area;

import java.io.IOException;
import java.util.Scanner;

public class AreaCirculo {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        double raio = calcularAreaCirculo(sc.nextDouble());
        System.out.println(formatarAreaCirculo(raio));
        sc.close();

    }

    public static double calcularAreaCirculo(double raio){
        double pi = 3.14159;
        return pi * (Math.pow(raio,2));
    }
    public static String formatarAreaCirculo(double raio){
        return String.format("A=%.4f",raio);
    }
}
