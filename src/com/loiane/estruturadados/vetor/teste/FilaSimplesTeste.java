package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.FilaSimples;

public class FilaSimplesTeste {

	public static void main(String[] args) {
		
	FilaSimples fila = new FilaSimples(10);
	fila.push(1);
	fila.push(3);
	fila.push(2);
	fila.push(3);
		
		System.out.println("pilha" + fila.toString());
		System.out.println("Fila está vazia? " + fila.isEmpty());	
		System.out.println("tamanho da fila: " + fila.size());
		System.out.println("ultimo elemento da fila: " + fila.topo());
		System.out.println("delete o primeir elemento" + fila.pop());
		System.out.println("pilha" + fila.toString());
		
		
	}

}
