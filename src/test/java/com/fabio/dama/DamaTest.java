package com.fabio.dama;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class DamaTest {

    private final Dama dama = new Dama();

    @Test
    void deveRetornarAsMexidasMinimasDaDama(){
        //given
        int X1 = 4, Y1 = 4, X2 = 6, Y2 = 2;

        //when
        Optional<Integer> min;

        if(X1 == 0 && Y1 == 0 && X2 == 0 && Y2 == 0) min = null ;
        else if(X1 == X2 && Y1 == Y2 ) min = Optional.of(0);
        else if((X1+Y1)%2!=0 && (X2+Y2)%2!=0) min = Optional.of(1);
        else if((X1+Y1)%2==0 && (X2+Y2)%2==0) min = Optional.of(1);
        else min = Optional.of(2);

        //then
        Optional<Integer> minAtual = dama.encontrarMin(X1,Y1,X2,Y2);

        Assertions.assertEquals(min,minAtual);

    }


}
