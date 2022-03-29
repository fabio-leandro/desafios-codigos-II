package com.fabio.distancia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DistanciaTest {

    @Test
    void deveRetornarTempoEmMinutosEntreDuasMotos(){

        int velocidadeX = 60;
        int velocidadeY = 90;

        int distanciaInformada = 110;

        int tempoEsperado = distanciaInformada * 2;

        int tempoAtual = Distancia.calculoTempo(distanciaInformada);

        Assertions.assertEquals(tempoEsperado, tempoAtual);

    }


}
