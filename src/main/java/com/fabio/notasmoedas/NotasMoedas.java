package com.fabio.notasmoedas;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NotasMoedas {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Double[] valores = {100d, 50d, 20d, 10d, 5d, 2d, 1d, 0.50, 0.25, 0.10, 0.05,0.01};

        String valorDouble = sc.nextLine();
        BigDecimal valor = new BigDecimal(valorDouble);


        List<Integer> lista = fazerDecomposicao(valor,valores);
        System.out.println("NOTAS:");
        for (int i = 0; i < lista.size()/2;i++){
                System.out.printf("%d nota(s) de R$ %.2f\n",lista.get(i),valores[i]);
        }
        System.out.println("MOEDAS:");
        for (int i = 6; i < lista.size();i++){
            System.out.printf("%d moeda(s) de R$ %.2f\n",lista.get(i),valores[i]);
        }
        sc.close();

    }

    public static List<Integer> fazerDecomposicao(BigDecimal valor, Double[] valores){
        List<Integer> notasEsperadas = new LinkedList<>();
        for(int i = 0; i < valores.length; i++) {
            BigDecimal item = valor.divide(new BigDecimal(valores[i].toString()));
            notasEsperadas.add(item.intValue());
            BigDecimal a = new BigDecimal(valores[i].toString());
            BigDecimal b = new BigDecimal(item.intValue());
            BigDecimal c = a.multiply(b);
            valor = valor.subtract(c);
        }
        return notasEsperadas;
    }

}
/*
0.97
Saída esperada:
NOTAS:
0 nota(s) de R$ 100.00
0 nota(s) de R$ 50.00
0 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
0 nota(s) de R$ 5.00
0 nota(s) de R$ 2.00
MOEDAS:
0 moeda(s) de R$ 1.00
1 moeda(s) de R$ 0.50
1 moeda(s) de R$ 0.25
2 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
2 moeda(s) de R$ 0.01
Sua Saída:
NOTAS:
0 nota(s) de R$ 100.00
0 nota(s) de R$ 50.00
0 nota(s) de
Mensagem:

 */
