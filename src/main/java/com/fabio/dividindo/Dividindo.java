package com.fabio.dividindo;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Dividindo {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int quantidadePares = scan.nextInt();

        for (int i = 0; i < quantidadePares;i++){
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            System.out.println(dividir(n1, n2));
        }

        scan.close();

    }

    public static String dividir(int n1, int n2){
        try {
            BigDecimal bigDecimalN1 = new BigDecimal(String.valueOf(n1));
            BigDecimal bigDecimalN2 = new BigDecimal(String.valueOf(n2));
            BigDecimal resultado =  bigDecimalN1.divide(bigDecimalN2,1, RoundingMode.HALF_EVEN);
             return String.format("%.1f",resultado);
        }catch (ArithmeticException e){
            return "divisao impossivel";
        }

    }
}
