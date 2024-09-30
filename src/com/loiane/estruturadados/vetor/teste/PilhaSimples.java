package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Pilha;

public class PilhaSimples {

	public static void main(String[] args) {
	
		Pilha pilha = new Pilha(10);
		pilha.push(1);
		pilha.push(3);
		pilha.push(2);
		pilha.push(3);
		

//		System.out.println("pilha" + pilha.imprime());
//		System.out.println("Topo" + pilha.topoNum());
//		System.out.println("" + pilha.toString());
//		System.out.println("Verificando se pilhas está vazia: " + pilha.isEmpty());
//		System.out.println("Verificando tamanho da pilha: " + pilha.size());
//		System.out.println("removendo 1 elementos do topo");
//		pilha.pop();
//		System.out.println("" + pilha.toString());
//		System.out.println("elemento que tá no topo: " + pilha.topo());
//		System.out.println("" + pilha.toString());
//		System.out.println("elemento encontrado em: " + pilha.boscaEle("bola")); 
//		pilha.Duplicatopo();
//		System.out.println("Duplicando topo");
//		System.out.println("" + pilha.toString());
//		System.out.println("" + pilha.toString());
//		pilha.inverteOrdem();
//		System.out.println("" + pilha.toString());
		System.out.println("" + pilha.toString());
		
		System.out.println("" + pilha.SumAll());
	}
}
