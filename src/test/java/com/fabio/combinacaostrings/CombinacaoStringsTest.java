package com.fabio.combinacaostrings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CombinacaoStringsTest {

    @Test
    @DisplayName("Deve retornar a combinação de strings.")
    void deveCombinarStrings(){

        String cadeia1 = "aA";
        String cadeia2 = "BbCd";
        StringBuilder cadeiaEsperada = new StringBuilder();

        if( cadeia1.length() == cadeia2.length()){
            for (int i = 0; i < cadeia1.length();i++){
                cadeiaEsperada.append(cadeia1.charAt(i));
                cadeiaEsperada.append(cadeia2.charAt(i));
            }
        }

        if (cadeia1.length() > cadeia2.length()){
            for (int i = 0; i < cadeia2.length();i++){
                cadeiaEsperada.append(cadeia1.charAt(i));
                cadeiaEsperada.append(cadeia2.charAt(i));
            }
            cadeiaEsperada.append(cadeia1.substring(cadeia2.length(), cadeia1.length()));
        }

        if (cadeia1.length() < cadeia2.length()){
            for (int i = 0; i < cadeia1.length();i++){
                cadeiaEsperada.append(cadeia1.charAt(i));
                cadeiaEsperada.append(cadeia2.charAt(i));
            }
            cadeiaEsperada.append(cadeia2.substring(cadeia1.length(), cadeia2.length()));
        }

        StringBuilder cadeiaAtual = CombinacaoStrings.combinar(cadeia1,cadeia2);
        Assertions.assertEquals(cadeiaEsperada.toString(),cadeiaAtual.toString());
    }
}
