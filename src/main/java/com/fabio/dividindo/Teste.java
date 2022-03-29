package com.fabio.dividindo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Teste {

    public static void main(String[] args) {

        BigDecimal b1 = new BigDecimal("200");
        BigDecimal b2 = new BigDecimal("300");

        BigDecimal resultado = b1.divide(b2,1, RoundingMode.HALF_EVEN);
        System.out.println(resultado);

    }
}
