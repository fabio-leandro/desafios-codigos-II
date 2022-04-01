package com.fabio.tempojogo.desafio;

import java.io.IOException;
import java.util.Scanner;

public class TempoJogo {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int horaInicial = scan.nextInt();
        int horaFinal = scan.nextInt();
        scan.close();
        System.out.println(calcular(horaInicial,horaFinal));


    }

    public static String calcular(int horaInicial, int horaFinal){

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

        return duracaoEsperada;
    }


}
