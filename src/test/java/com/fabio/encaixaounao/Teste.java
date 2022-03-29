package com.fabio.encaixaounao;

import java.util.List;

public class Teste {

    public static void main(String[] args) {

        String valor = "5678690";
        List<String> lista = List.of(valor.split(""));
        lista.forEach(System.out::println);
        System.out.println(lista.size());
        System.out.println("*******************************************************");
        for (char c: valor.toCharArray()){
            System.out.println(c);
        }
    }
}
