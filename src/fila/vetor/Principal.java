package fila.vetor;

public class Principal {

    public static void main(String[] args) throws Exception {
        Fila fila = new Fila();
       
            fila.enfileira("Matheus");
            fila.enfileira("Marcos");
            fila.enfileira("Lucas");
            fila.enfileira("João");
            fila.enfileira("Pedro");
            fila.enfileira("Tiago");
            fila.enfileira("Felipe");
            fila.imprime();
            
            System.out.println("Desenfileirou: " + fila.desenfileira());
            
            fila.imprime();
            
            fila.enfileira("Paulo");
            fila.enfileira("Temóteo");
            
            System.out.println("Desenfileirou: " + fila.desenfileira());
            System.out.println("Desenfileirou: " + fila.desenfileira());
            System.out.println("Desenfileirou: " + fila.desenfileira());
            System.out.println("Desenfileirou: " + fila.desenfileira());
            fila.imprime();
    
}
}
