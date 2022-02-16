package com.fabio.notasmoedas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NotasMoedasTest {

    private final NotasMoedas notasMoedas = new NotasMoedas();

    @Test
    void deveRetonarDecomposicaoNotas(){
        //given
        BigDecimal valor = new BigDecimal("0.97");
        Double[] notas = {100d, 50d, 20d, 10d, 5d, 2d, 1d, 0.50, 0.25, 0.10, 0.05,0.01};
        //when
        List<Integer> notasEsperadas = new LinkedList<>();
        for(int i = 0; i < notas.length; i++) {
            BigDecimal item = valor.divide(new BigDecimal(notas[i].toString()));
            notasEsperadas.add(item.intValue());
            BigDecimal a = new BigDecimal(notas[i].toString());
            BigDecimal b = new BigDecimal(item.intValue());
            BigDecimal c = a.multiply(b);
            valor = valor.subtract(c);
        }
        //then
        valor = new BigDecimal("0.97");
        List<Integer> notasAtuais = notasMoedas.fazerDecomposicao(valor,notas);
        Assertions.assertEquals(notasEsperadas,notasAtuais);
    }

}
