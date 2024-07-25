package com.oliveiraordep.vetor.teste;

import com.oliveiraordep.vetor.Vetor;

public class Teste {
    public static void main(String[] args) {

        Vetor<String> vetor = new Vetor<String>(5); 

        vetor.adicionar("A");
        vetor.adicionar("C");
        vetor.adicionar("E");

        System.out.println("Tamanho do vetor: " + vetor.tamanhoReal());
        System.out.println("Elementos do vetor: " + vetor.toString());
        System.out.println("Elemento por posição (Indice do vetor): " + vetor.busca(2));
        System.out.println("Verificar se um elemento existe no vetor (Busca sequencial): " + vetor.busca("B"));

        System.out.println();
        System.out.println("=============================================");
        System.out.println();

        vetor.adicionar(1, "B");
        vetor.adicionar(3, "D");

        System.out.println("Tamanho do vetor: " + vetor.tamanhoReal());
        System.out.println("Elementos do vetor: " + vetor.toString());
        System.out.println("Elemento por posição (Indice do vetor): " + vetor.busca(2));
        System.out.println("Verificar se um elemento existe no vetor (Busca sequencial): " + vetor.busca("D"));
        
        System.out.println();
        System.out.println("=============================================");
        System.out.println();

        //OBS: Quando a capacidade do vetor estiver cheia, será adicionando mais posições no vetor

        vetor.adicionar("F");
        vetor.adicionar("G");
        vetor.adicionar("H");

        System.out.println("Tamanho do vetor: " + vetor.tamanhoReal());
        System.out.println("Elementos do vetor: " + vetor.toString());
        System.out.println("Elemento por posição (Indice do vetor): " + vetor.busca(6));
        System.out.println("Verificar se um elemento existe no vetor (Busca sequencial): " + vetor.busca("H"));

        System.out.println();
        System.out.println("=============================================");
        System.out.println();

        vetor.remove(1);

        System.out.println("Tamanho do vetor: " + vetor.tamanhoReal());
        System.out.println("Elementos do vetor: " + vetor.toString());
        System.out.println("Elemento por posição (Indice do vetor): " + vetor.busca(2));
        System.out.println("Verificar se um elemento existe no vetor (Busca sequencial): " + vetor.busca("D"));
    }
}
