package com.fabio.encaixaounao;

import java.io.IOException;
import java.util.Scanner;

public class EncaixaOuNao {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int quantidade = scan.nextInt();
        for (int i = 0;i < quantidade;i++){
            String valor1 = scan.next();
            String valor2 = scan.next();
            System.out.println(verificar(valor1,valor2));
        }

        scan.close();
    }

    public static String verificar(String valor1, String valor2){
        int indiceValor1 = valor1.length() - 1;
        String resultadoEsperado = "";
        if(valor1.length() < valor2.length()){
            resultadoEsperado = "nao encaixa";
        }else {
            for (int i = valor2.length() - 1; i >= 0;i--){
                if(valor2.charAt(i) == valor1.charAt(indiceValor1)){
                    resultadoEsperado = "encaixa";
                    indiceValor1 = indiceValor1 - 1;
                }else {
                    resultadoEsperado = "nao encaixa";
                    break;
                }
            }
        }

        return resultadoEsperado;
    }
}
