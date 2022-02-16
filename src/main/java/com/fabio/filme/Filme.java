package com.fabio.filme;

import java.io.IOException;
import java.util.Scanner;

public class Filme {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double variacao = calcularVariacaoPreco(sc.nextDouble(),sc.nextDouble());
        System.out.println(formatarSaidaVariacao(variacao));
        sc.close();

    }
    public static double calcularVariacaoPreco(double precoAntigo, double precoNovo){
        return ((precoNovo - precoAntigo) / precoAntigo) * 100;
    }
    public static String formatarSaidaVariacao(double variacao){
        String sinal = "%";
        return  String.format("%.2f%s",variacao,sinal);
    }
}
