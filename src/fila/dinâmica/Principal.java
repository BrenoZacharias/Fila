package fila.dinâmica;

public class Principal {
	public static void main(String [] args) {
		
		Fila fila = new Fila();
	
		fila.enfileira("Amanda");
		fila.enfileira("Ana");
		fila.enfileira("Aline");
		fila.enfileira("Alessandra");
		fila.enfileira("Joao");
		
		fila.imprime();
		
		System.out.println("desenfileira " + fila.desenfileira()); //deve retirar a Amanda da fila
		System.out.println("desenfileira " + fila.desenfileira()); //deve retirar a Ana da fila

		
		fila.imprime();
		
		System.out.println("desenfileira " + fila.desenfileira()); //deve retirar a Aline da fila
		fila.imprime();
	}
}
