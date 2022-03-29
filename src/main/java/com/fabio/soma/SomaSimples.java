package com.fabio.soma;

import java.io.IOException;
import java.util.Scanner;

public class SomaSimples {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println(somar(scan.nextInt(),scan.nextInt()));
        scan.close();
    }

    public static String somar(int a, int b){
        return String.format("SOMA = %d", a + b);
    }
}
