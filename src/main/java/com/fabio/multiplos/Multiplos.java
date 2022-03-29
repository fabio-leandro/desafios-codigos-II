package com.fabio.multiplos;

import java.io.IOException;
import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        System.out.println(verificar(n1,n2));
        scan.close();

    }

    public static String verificar(int n1, int n2){
        String resposta = "";
        if (n2 % n1 == 0 || n1 % n2 == 0){
            resposta = "Sao Multiplos";
        }else {
            resposta = "Nao sao Multiplos";
        }
        return resposta;
    }
}
