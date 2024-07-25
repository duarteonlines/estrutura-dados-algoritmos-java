package com.oliveiraordep.vetor;

import java.util.StringJoiner;

public class Vetor<T> {
    /*Tipo de vetor*/
    private T[] elementos;
    /*Guardando o tamanho do vetor */
    private int tamanho;

    /*Instanciando o Vetor com capacidade */
    public Vetor(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
    }

    public void aumentaCapacidade() {
        T[] novosElementos = (T[]) new Object[this.elementos.length * 2];
        for (int i = 0; i < this.elementos.length; i++) {
            novosElementos[i] = this.elementos[i];
        }
        this.elementos = novosElementos;
    }

    /*Adicionando elementos no Vetor*/
    public boolean adicionar(T elemento) {
        aumentaCapacidade();
        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    /*Adicionando elementos no Vetor em uma posicao especifica*/
    public boolean adicionar(int posicao, T elemento) {
        aumentaCapacidade();
        if(!(posicao >= 0 && posicao < this.tamanho)) {
            return false;
        }

        //Move os elementos para posição seguinte
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    public void remove(int posicao) {
        if(!(posicao >= 0 && posicao < this.tamanho)) { 
            throw new IllegalArgumentException("Posição inválida");
        }

        for (int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }

        this.tamanho--;
    }

    /*Retornando o tamanho real do Vetor*/
    public int tamanhoReal() {
        return this.tamanho;
    }

    /*Buscando elementos por uma posicao no Vetor*/
    public T busca(int posicao) {
        if(!(posicao >= 0 && posicao < this.tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    /*Verificar se um elemento existe no vetor (Busca sequencial) */
    public int busca(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }

        return -1;
    }

    /*Retornando o elementos do Vetor*/
    @Override
    public String toString() {
        
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < this.tamanho; i++) {
            sj.add(this.elementos[i].toString());
        }
        return sj.toString();
    }
}
