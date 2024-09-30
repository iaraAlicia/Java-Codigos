package com.loiane.estruturadados.vetor;

import java.util.Arrays;

public class FilaSimples {
	
	private Object elementos[];
	private int topo;
	
	public FilaSimples(int capacidade) {
		this.elementos = new Object[capacidade];
		this.topo = -1;
	}
	
	public boolean push(Object elemento) {
		if(this.topo < this.elementos.length) {
			this.topo++;
			this.elementos[topo] = elemento;
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		return topo<0;
	}
	public int size() {
		if(this.isEmpty()) return -1;
		return this.topo+1;
	}
	public Object topo() {
		if(this.isEmpty()) return -1;
		return this.elementos[topo];
	}
	
	public Object pop() {
		if(this.isEmpty()) return null;
		
		Object ele = this.elementos[0];
		this.removePor(0);
		return ele;
	}
	
	public String imprime() {
		return Arrays.toString(elementos);
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("|------Pilha-------|");
		for(int i= topo; i >= 0; i--) {
			s.append("\n|");
			s.append(elementos[i]); 
			s.append("|");
		}
		s.append("\n|------Fim-------|");
		return s.toString();
	}
	
	public boolean removePor(int posicao) {
		   for(int i = posicao; i < this.size(); i++) {
			   this.elementos[i] = this.elementos[i+1];
		   }
		   this.topo--;
		return false;
	}
	
//	Como implementar um método para encontrar o maior valor presente na fila?	
	
	public Object maiorValor() {
	    if (this.isEmpty()) {
	        return null; // Fila vazia
	    }
	    
	    Object maior = this.elementos[0]; // Começa com o primeiro elemento
	    for (int i = 1; i <= this.topo; i++) {
	        if ((int) this.elementos[i] > (int) maior) {
	            maior = this.elementos[i];
	        }
	    }
	    
	    return maior;
	}
//	 Como fazer a rotação dos elementos da fila em uma determinada quantidade de vezes?
//	A rotação move os elementos da frente da fila para o final, um número especificado de vezes. Aqui está como fazer isso:
	public void rotacionar(int vezes) {
	    for (int i = 0; i < vezes; i++) {
	        Object primeiro = this.pop(); // Remove o primeiro elemento
	        this.push(primeiro); // Coloca o primeiro no final
	    }
	}
//	Como calcular a soma de todos os elementos na fila?
//	Aqui está como você pode somar os elementos da fila, assumindo que eles sejam inteiros:
	public int somaElementos() {
	    if (this.isEmpty()) {
	        return 0; // Fila vazia
	    }

	    int soma = 0;
	    for (int i = 0; i <= this.topo; i++) {
	        soma += (int) this.elementos[i]; // Somar cada elemento
	    }

	    return soma;
	}
//	Como implementar um método que retorna o elemento no meio da fila?
//	Para encontrar o elemento do meio, calculamos o índice do meio da fila e retornamos o elemento dessa posição:
	
	public Object elementoDoMeio() {
	    if (this.isEmpty()) {
	        return null; // Fila vazia
	    }
	    
	    int meio = this.topo / 2; // Índice do meio
	    return this.elementos[meio];
	}

	
	public FilaSimples intercala(FilaSimples x, FilaSimples y) {
	    FilaSimples intercalada = new FilaSimples();

	    while (!x.isEmpty() || !y.isEmpty()) {
	        if (!x.isEmpty()) {
	            intercalada.enfileirar(x.desenfileirar());
	        }
	        if (!y.isEmpty()) {
	            intercalada.enfileirar(y.desenfileirar());
	        }
	    }

	    return intercalada;
	}
	
	
	
	
}
