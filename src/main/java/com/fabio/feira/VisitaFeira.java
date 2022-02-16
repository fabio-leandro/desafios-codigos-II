package com.fabio.feira;

import java.io.IOException;
import java.util.Scanner;

public class VisitaFeira {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println(somarPimentoes(sc.nextInt(),sc.nextInt()));
        sc.close();

    }
    public static String somarPimentoes(int A, int B){
        int X = A + B;
        return String.format("X = %d",X);
    }
}
