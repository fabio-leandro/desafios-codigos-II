package com.fabio.dama;

import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;

public class Dama {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (true){
            int X1 = sc.nextInt(), Y1 = sc.nextInt(), X2 = sc.nextInt(), Y2 = sc.nextInt();
            Optional<Integer> min = encontrarMin(X1,Y1,X2,Y2);
            if(min == null) break;
            else System.out.println(min.get());
        }
        sc.close();

    }

    public static Optional<Integer> encontrarMin(int X1, int Y1, int X2, int Y2){

        Optional<Integer> min;

        if(X1 == 0 && Y1 == 0 && X2 == 0 && Y2 == 0) min = null ;
        else if(X1 == X2 && Y1 == Y2 ) min = Optional.of(0);
        else if((X1+Y1)%2!=0 && (X2+Y2)%2!=0) min = Optional.of(1);
        else if((X1+Y1)%2==0 && (X2+Y2)%2==0) min = Optional.of(1);
        else min = Optional.of(2);

        return min;

    }
}
