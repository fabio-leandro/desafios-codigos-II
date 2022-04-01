package com.fabio.paresimpares;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrdemParesImparesTest {


    @Test
    @DisplayName("Deve verificar se o numero é impar ou par e adicionar na respectiva lista.")
    void listarParesImpares(){

        int n1 = 11;
        int n2 = 12;

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        boolean b = n1 % 2 == 0 ? pares.add(n1) : impares.add(n1);
        OrdemParesImpares.listarParesImpares(n1,pares,impares);
        OrdemParesImpares.listarParesImpares(n2,pares,impares);

        Assertions.assertEquals(n1,impares.get(0));
        Assertions.assertEquals(n2,pares.get(0));

    }

    @Test
    @DisplayName("Deve listar os numeros em ordem crescente")
    void ordenarListaCrescente(){

        List<Integer> lista = List.of(32,4,34,654,98,3456);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        List<Integer> ordenadas = lista.stream().sorted(comparator).collect(Collectors.toList());

        List<Integer> ordemAtual = OrdemParesImpares.ordernarOrdemCrescente(lista);
        Assertions.assertEquals(ordenadas, ordemAtual);


    }

    @Test
    @DisplayName("Dever ordenar lista de forma descrescente.")
    void ordenarListaDescrescente(){

        List<Integer> lista = List.of(32,4,34,654,98,3456);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };

        List<Integer> decrescentes = lista.stream().sorted(comparator.reversed()).collect(Collectors.toList());
        List<Integer> ordermAtual = OrdemParesImpares.ordenarOrdemDescrescente(lista);
        Assertions.assertEquals(decrescentes,ordermAtual);

    }



}
