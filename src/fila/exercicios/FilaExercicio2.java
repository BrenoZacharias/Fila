package fila.exercicios;

import java.util.LinkedList;
import java.util.Queue;

public class FilaExercicio2 {

	public static void main(String[] args) {
		
		Queue<Integer> fila = new LinkedList<>();
//		for(int i=0; i<=4;i++){
//			f.add(i);
//	}
		fila.add(0);
		fila.add(1);
		fila.add(2);
		fila.add(3);
		fila.add(4);
		
		System.out.println("Fila de espera: " + fila);
		
		Integer numero = fila.poll();
		System.out.println("Removido da Fila: " + numero + " | Nova Fila: " + fila);
		
		Integer cabeca = fila.element();
		System.out.println("Primeiro elemento da Fila: " + cabeca);
		
		System.out.println("Tamanhon da fila: " + fila.size());
	}
}

