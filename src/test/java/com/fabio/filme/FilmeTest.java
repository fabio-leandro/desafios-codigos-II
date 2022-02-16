package com.fabio.filme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmeTest {

    private final Filme filme = new Filme();

    @Test
    void deveRetornarPercentualVariacaoPreco(){

        //given
        double precoAntigo = 20.00, precoNovo = 30.00;
        //when
        double variacaoEsperada = ((precoNovo - precoAntigo) / precoAntigo) * 100;
        //then
        double variacaoAtual = filme.calcularVariacaoPreco(precoAntigo, precoNovo);
        Assertions.assertEquals(variacaoEsperada,variacaoAtual);
    }

    @Test
    void deveRetornarSaidaFormatadaVariacao(){
        //given
        double variacao = 50.00;
        String simbolo = "%";
        //when
        String variacaoEsperada = String.format("%.2f%s",variacao,simbolo);
        //then
        String variacaoAtual = filme.formatarSaidaVariacao(variacao);
        Assertions.assertEquals(variacaoEsperada, variacaoAtual);
    }
}
