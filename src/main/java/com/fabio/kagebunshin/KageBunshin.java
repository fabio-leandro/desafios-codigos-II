package com.fabio.kagebunshin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KageBunshin {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linha;

        while ((linha = br.readLine()) != null){
            System.out.println(calcular(Integer.parseInt(linha)));
        }
    }

    public static int calcular(int ninjas){
        if (ninjas == 0 || ninjas ==1) return 0;
        return ninjas /2;
    }
}
