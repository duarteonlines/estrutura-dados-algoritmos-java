package com.oliveiraordep.vetor.teste;

import com.oliveiraordep.vetor.Vetor;

public class Teste2 {
    public static void main(String[] args) {

        ContatoTeste contatos = new ContatoTeste("Pedro", "p@p.com", "1111-1111");
        ContatoTeste contatos2 = new ContatoTeste("Maria", "m@m.com", "2222-2222");
        ContatoTeste contatos3 = new ContatoTeste("João", "j@j.com", "3333-3333");

        Vetor<ContatoTeste> vetor = new Vetor<ContatoTeste>(3);

        vetor.adicionar(contatos);
        vetor.adicionar(contatos2);
        vetor.adicionar(contatos3);
        
        System.out.println(vetor.toString());



    }

}
