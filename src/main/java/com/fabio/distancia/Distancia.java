package com.fabio.distancia;

import java.io.IOException;
import java.util.Scanner;

public class Distancia {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int tempo = calculoTempo(scan.nextInt());
        System.out.printf("%d minutos\n",tempo);
        scan.close();

    }

    public static int calculoTempo(int distancia){
        return distancia * 2;
    }
}
