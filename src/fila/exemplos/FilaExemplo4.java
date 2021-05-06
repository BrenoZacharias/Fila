package fila.exemplos;

import java.util.LinkedList;
import java.util.Queue;

public class FilaExemplo4 {
	public static void main(String [] args) {	
		//criar um objeto do tipo Fila de Inteiros (Integer)
		 Queue<Integer> f = new LinkedList<>();
		 
		//Adicionar os elementos 0, 1, 2, 3, 4 na fila
		 for(int i=0; i<=4; i++) {
			 f.add(i);
		 }
		 
	    /*f.add(0);
	    f.add(1);
	    f.add(2);
	    f.add(3);
	    f.add(4);*/
		
	    //Mostrar o conte�do da fila
	    System.out.println("Fila: " + f);
	    
		//Remover o cabe�a da fila
	    f.remove();
	    
	    //Remover o cabe�a da fila -- Gustavo
	    int num = f.remove();
        System.out.println("Removido da Fila : " + num);
	    
		//Mostrar o conte�do da fila
	    System.out.println("Fila: " + f);
	    
		//Visualizar o cabe�a da fila
	    int head = f.peek();
	    System.out.println("Cabe�a da Fila: " + head);
	    
	    //Exibindo o novo 1� elemento -- Fernando
        System.out.println("O primeiro da lista �: "+f.element());
	    
		//Mostrar o tamanho da fila
	    System.out.println("Tamanho da Fila: " + f.size());
	    
	    //Exibindo o tamanho da nova lista --Fernando
        System.out.println("O tamanho da lista � de: "+f.size()+" elementos");
	}
}
