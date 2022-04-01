package com.fabio.paresimpares;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OrdemParesImpares {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        int N = scan.nextInt();

        for (int i = 0; i < N; i++){
            int numeroParaAvaliar = scan.nextInt();
            listarParesImpares(numeroParaAvaliar,pares,impares);
        }
        List<Integer> paresOrdenados = ordernarOrdemCrescente(pares);
        List<Integer> imparesOrdenados = ordenarOrdemDescrescente(impares);

        paresOrdenados.forEach(System.out::println);
        imparesOrdenados.forEach(System.out::println);

        scan.close();

    }

    public static void listarParesImpares(int n, List<Integer> pares, List<Integer> impares){
        boolean b = n % 2 == 0 ? pares.add(n) : impares.add(n);
    }

    public static List<Integer> ordernarOrdemCrescente(List<Integer> pares){

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        return pares.stream().sorted(comparator).collect(Collectors.toList());
    }

    public static List<Integer> ordenarOrdemDescrescente(List<Integer> impares){

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        return impares.stream().sorted(comparator.reversed()).collect(Collectors.toList());
    }
}
