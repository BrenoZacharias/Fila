package fila.exemplos;

import java.util.LinkedList;
import java.util.Queue;

public class FilaExemplo2 {
    public static void main(String[] args) {
        
        Queue<String> fila_de_espera = new LinkedList<>();

        //add � equivalente ao m�todo enfileira() 
        fila_de_espera.add("Ana");
        fila_de_espera.add("Maria");
        fila_de_espera.add("Ester");
        fila_de_espera.add("Debora");

        System.out.println("Fila : " + fila_de_espera);

        // Verifica se a fila est� vazia
        System.out.println("A fila est� vazia? : " + fila_de_espera.isEmpty());

        // Encontre o tamanho da Fila
        System.out.println("Tamanho da Fila : " + fila_de_espera.size());

        //Verifica se a fila cont�m um determinado elemento
        String nome = "Ester";
        if(fila_de_espera.contains(nome)) {
            System.out.println("Fila contem " + nome);
        } else {
            System.out.println("Fila n�o contem " + nome);
        }

        // Obtem o elemento da frente da fila e usa-o, sem remove-lo usando o m�todo element()
        // O m�todo element() throws NoSuchElementException se a Fila est� vazia
        String primeira_pessoa_na_fila_de_espera =  fila_de_espera.element();
        System.out.println("Primeira Pessoa da Fila (element()) : " + primeira_pessoa_na_fila_de_espera);

        System.out.println("Fila : " + fila_de_espera);
        
        // Obtem o elemento da frente da Fila sem remove-lo usando o m�todo peek()
        // O m�todo peek() � similar ao element() exceto porque ele retorna null se a pilha estiver vazia
        primeira_pessoa_na_fila_de_espera = fila_de_espera.peek();
        System.out.println("Primeira Pessoa da Fila (peek()) : " + primeira_pessoa_na_fila_de_espera);
        System.out.println("Fila : " + fila_de_espera);
        nome = fila_de_espera.remove();
        System.out.println("Fila : " + fila_de_espera);
    }
}
