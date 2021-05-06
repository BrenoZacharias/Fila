package fila.string;
import java.util.LinkedList;
import java.util.Queue;

public class Principal {

	public static void main(String[] args) {
		Queue<String> fila_de_estudantes = new LinkedList<>();
		
		fila_de_estudantes.add("Carlos");
		fila_de_estudantes.add("Elias");
		fila_de_estudantes.add("Carla");
		fila_de_estudantes.add("Maria");
		fila_de_estudantes.add("Maicon");
		fila_de_estudantes.add("Ana");
		
		System.out.println("Fila de estudantes: " + fila_de_estudantes);
		
		System.out.println("A fila está vazia? " + fila_de_estudantes.isEmpty());
		
		System.out.println("Tamanho da fila: " + fila_de_estudantes.size());
		
		String primeira_pessoa_da_fila = fila_de_estudantes.peek();
		System.out.println("Primeira pessoa da fila: " + primeira_pessoa_da_fila);
		
		if(fila_de_estudantes.contains("Carlos")){
			System.out.println("Contém");
		}
		else{
			System.out.println("Não contém");
		}
		
		String nome = fila_de_estudantes.poll();
		System.out.println("Fila de estudantes: " + fila_de_estudantes + "\nRemovido: " + nome);
		
		System.out.println("A fila está vazia? " + fila_de_estudantes.isEmpty());
		
		System.out.println("Tamanho da fila: " + fila_de_estudantes.size());
		
		primeira_pessoa_da_fila = fila_de_estudantes.peek();
		System.out.println("Primeira pessoa da fila: " + primeira_pessoa_da_fila);
		
		if(fila_de_estudantes.contains("Carlos")){
			System.out.println("Contém");
		}
		else{
			System.out.println("Não contém");
		}
	}
}

