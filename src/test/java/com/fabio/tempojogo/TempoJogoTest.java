package com.fabio.tempojogo;

import com.fabio.tempojogo.desafio.TempoJogo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TempoJogoTest {

    @Test
    @DisplayName("Retornar duração do jogo dado hora inicial e hora final")
    void deveRetornarDuracaoJogo(){

        int horaInicial = 2;
        int horaFinal = 16;
        String duracaoEsperada = "";

        if(horaInicial == horaFinal){
            duracaoEsperada = "O JOGO DUROU 24 HORA(S)";
        }else if(horaInicial > horaFinal){
            int duracao = (24 - horaInicial) + horaFinal;
            duracaoEsperada = String.format("O JOGO DUROU %d HORA(S)",duracao);
        }else if(horaInicial < horaFinal){
            int duracao = horaFinal - horaInicial;
            duracaoEsperada = String.format("O JOGO DUROU %d HORA(S)",duracao);
        }

        String duracaoAtual = TempoJogo.calcular(horaInicial, horaFinal);
        Assertions.assertEquals(duracaoEsperada, "O JOGO DUROU 14 HORA(S)");

    }

}
