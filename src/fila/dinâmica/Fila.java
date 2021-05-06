package fila.dinâmica;

public class Fila {
	No inicio;
	No fim;
	
	//o método construtor criará uma fila vazia.
	public Fila() {
		this.inicio = new No();
		this.fim = this.inicio;
		this.inicio.prox = null;
	}
	
	public void enfileira(Object elemento) {
		this.fim.prox = new No();
		this.fim = this.fim.prox;
		this.fim.item = elemento;
		this.fim.prox = null;
	}
	
	public Object desenfileira() {
		Object elemento = null;
		if(!(this.vazia())) {
			this.inicio = this.inicio.prox;
			elemento = this.inicio.item;
		}
		return elemento;	
	}
	
	public boolean vazia() {
		return this.inicio == this.fim;
	}
	
	public void imprime() {
        No aux;
        aux = this.inicio.prox;
        while (aux != null) {
            System.out.print(" " + aux.item.toString());
            aux = aux.prox;
        }
        System.out.println();
    }

}
