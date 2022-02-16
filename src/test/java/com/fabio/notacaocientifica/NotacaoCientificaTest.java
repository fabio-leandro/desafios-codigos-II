package com.fabio.notacaocientifica;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NotacaoCientificaTest {

    private NotacaoCientifica notacaoCientifica = new NotacaoCientifica();

    @Test
    void deveRetornarNumeroFormatadoEmNotacaoCientifica(){

        //given
        String valor = "100";
        valor = valor.charAt(0) != '-' ? "+"+valor:valor;

        //when
        String stringEsperada = "";
        if(valor.charAt(1) != '0' && valor.charAt(2) == '.'){
            stringEsperada = String.format("%s%.4f%s",valor.charAt(0),Double.parseDouble(valor),"E+00")
                    .replace("--","-");
        }else if(valor.charAt(1) != '0' && valor.charAt(2) != '.'){
            if(valor.charAt(1) == '1' && Double.parseDouble(valor.substring(2,valor.length())) == 0){
                stringEsperada = String.format("%s%.4fE+%02d",valor.charAt(0),Double.parseDouble("1"),
                        valor.substring(2,valor.length()).length()-2);
            }
            valor.replace(".","");
            stringEsperada = valor.substring(0,2) + "." + valor.substring(2,valor.length());
            stringEsperada = String.format("%s%.4fE+%02d",stringEsperada.charAt(0),Double.parseDouble(stringEsperada),
                stringEsperada.length() - 3).replace("--","-");
        }else if(valor.charAt(1) == '0'){
            if (Double.parseDouble(valor) == 0){
                stringEsperada = String.format("%s%.4fE+00",valor.charAt(0),Double.parseDouble(valor))
                        .replace("--","-");
            }
            int expoente = 0;
            for (int i = valor.length()-2; i >= 2; i--){
                if(valor.charAt(i) != '.') expoente++;
            }
            valor = valor.replace(".","");
            for (int i = 0; i < valor.length(); i++){
                if (valor.charAt(i) == '0') valor = valor.replace("0","");
            }
            stringEsperada =  valor.substring(0,2) + "." + valor.substring(2,valor.length());
            stringEsperada = String.format("%s%1.4fE-%02d",stringEsperada.charAt(0),Double.parseDouble(stringEsperada),
                    expoente).replace("--","-");

        }
        //then
        String valorTeste = "100";
        String stringAtual = notacaoCientifica.retornarNotacaoCientifica(valorTeste);
        Assertions.assertEquals(stringEsperada,stringAtual);
    }

}
