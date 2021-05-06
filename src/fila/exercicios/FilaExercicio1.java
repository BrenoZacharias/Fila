package fila.exercicios;

import java.util.LinkedList;
import java.util.Queue;

public class FilaExercicio1 {

	public static void main(String[] args) {
		Queue<String> f1 = new LinkedList<>();
		Queue<String> f2 = new LinkedList<>();
		
		f1.add("Ana");
		f1.add("Maria");
		f2.add("Jose");
		f1.poll();
		f1.add("Soraia");
		f2.add("Soraia");
		f2.add(f1.poll());
		f1.add(f2.poll());
		f2.add("Joao");
		f1.add(f2.poll());
		
		System.out.println("Fila 1: " + f1 + "\nFila2: " + f2);
	}
}