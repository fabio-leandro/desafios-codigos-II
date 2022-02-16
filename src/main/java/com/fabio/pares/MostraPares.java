package com.fabio.pares;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MostraPares {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        for (Integer i: mostrarPares(scanner.nextInt())) System.out.println(i);
        scanner.close();

    }

    public static List<Integer> mostrarPares(int numero){
        List<Integer> pares = new ArrayList<>();
        for (int i = 1; i <= numero; i++){
            if(i % 2 == 0) pares.add(i);
        }
        return pares;
    }
}
