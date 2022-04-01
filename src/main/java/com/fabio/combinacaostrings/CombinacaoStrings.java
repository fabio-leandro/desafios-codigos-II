package com.fabio.combinacaostrings;

import java.util.Scanner;

public class CombinacaoStrings {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        for (int i = 0; i < N;i++){
            String cadeia1 = scan.next();
            String cadeia2 = scan.next();
            System.out.println(combinar(cadeia1,cadeia2));
        }

        scan.close();

    }

    public static StringBuilder combinar(String cadeia1, String cadeia2){

        StringBuilder cadeiaEsperada = new StringBuilder();

        if( cadeia1.length() == cadeia2.length()){
            for (int i = 0; i < cadeia1.length();i++){
                cadeiaEsperada.append(cadeia1.charAt(i));
                cadeiaEsperada.append(cadeia2.charAt(i));
            }
        }

        if (cadeia1.length() > cadeia2.length()){
            for (int i = 0; i < cadeia2.length();i++){
                cadeiaEsperada.append(cadeia1.charAt(i));
                cadeiaEsperada.append(cadeia2.charAt(i));
            }
            cadeiaEsperada.append(cadeia1.substring(cadeia2.length(), cadeia1.length()));
        }

        if (cadeia1.length() < cadeia2.length()){
            for (int i = 0; i < cadeia1.length();i++){
                cadeiaEsperada.append(cadeia1.charAt(i));
                cadeiaEsperada.append(cadeia2.charAt(i));
            }
            cadeiaEsperada.append(cadeia2.substring(cadeia1.length(), cadeia2.length()));
        }

        return cadeiaEsperada;
    }
}
