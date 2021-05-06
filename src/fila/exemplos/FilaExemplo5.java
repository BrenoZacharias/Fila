package fila.exemplos;

import java.util.LinkedList;
import java.util.Queue;

public class FilaExemplo5 {

	public static void main(String[] args) {
		Queue<String> F = new LinkedList<>();
		
		F.add("x");
		System.out.println(F.poll());
		F.add("y");
		F.add("z");
		F.add("w");
		
	}
}
