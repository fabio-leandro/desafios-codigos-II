package com.fabio.experiencias;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Experiencia {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        List<Animal> animals = new LinkedList<>();
        int N = sc.nextInt();
        for (int i = 0; i < N; i++){
            int qtd = sc.nextInt();
            String tipo = sc.next();
            Animal animal = new Animal(tipo,qtd);
            animals.add(animal);
        }
        sc.close();
        int coelhos = 0, ratos = 0, sapos = 0;
        for (Animal a: animals){
            if(a.getTipo().equals("C")) coelhos +=a.getQtd();
            if(a.getTipo().equals("R")) ratos+=a.getQtd();
            if(a.getTipo().equals("S")) sapos+=a.getQtd();
        }
        int totalCobaias = (coelhos+ratos+sapos);
        double percentCoelhos = (double) coelhos / totalCobaias * 100;
        double percentRatos = (double) ratos / totalCobaias * 100;
        double percentSapos = (double) sapos / totalCobaias * 100;
        System.out.printf("Total: %d cobaias\n",totalCobaias);
        System.out.printf("Total de coelhos: %d\n",coelhos);
        System.out.printf("Total de ratos: %d\n",ratos);
        System.out.printf("Total de sapos: %d\n",sapos);
        System.out.printf("Percentual de coelhos: %.2f %s\n", percentCoelhos,"%");
        System.out.printf("Percentual de ratos: %.2f %s\n", percentRatos,"%");
        System.out.printf("Percentual de sapos: %.2f %s\n", percentSapos,"%");
    }
}
class Animal{
    private String tipo;
    private int qtd;
    public Animal(String tipo, int qtd) {
        this.tipo = tipo;
        this.qtd = qtd;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
