package com.fabio.media;

import java.io.IOException;
import java.util.Scanner;

public class CalculoMedia {

    private static final double pesoA = 3.5;
    private static final  double pesoB = 7.5;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double media = calcularMedia(A,B);
        System.out.println(formatarMedia(media));
        scanner.close();
    }

    public static double calcularMedia(double A, double B){
        return ((A * pesoA) + (B * pesoB)) / (pesoA + pesoB);
    }

    public static String formatarMedia(double media){
        return String.format("MEDIA = %.5f", media);
    }
}
