package fila.estudante;

import java.util.LinkedList;
import java.util.Queue;

public class Principal {

	public static void main(String[] args) {
		
		//Criação da fila e dos Estudantes
		Queue<Estudante> filaDeEstudante = new LinkedList<>();
		Estudante e1 = new Estudante("Mike");
		Estudante e2 = new Estudante("Carlton");
		Estudante e3 = new Estudante("John");
		
		///Adição dos estudantes
		filaDeEstudante.add(e1);
		filaDeEstudante.add(e2);
		filaDeEstudante.add(e3);
		
		//imprimindo todos os elementos e os removendo da lista
		System.out.print("Fila: \n");
		for(int i = 0; i < filaDeEstudante.size()+i; i++) {
			System.out.println(filaDeEstudante.poll().getNome() + " ");
		}
		
		//Re-adição dos alunos
		filaDeEstudante.add(e1);
		filaDeEstudante.add(e2);
		filaDeEstudante.add(e3);
		
		//Removendo e1
		System.out.println("\nRemovendo " + e1.getNome());
		filaDeEstudante.remove(e1);
		
		//imprimindo os elementos da lista novamente
		System.out.print("\nFila: \n");
		for(int i = 0; i < filaDeEstudante.size()+i; i++) {
			System.out.println(filaDeEstudante.poll().getNome() + " ");
		}	
	}
}
