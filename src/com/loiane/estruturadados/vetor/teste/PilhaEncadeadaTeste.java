package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.PilhaEncadeada;
import com.loiane.estruturadados.vetor.Vetor;

public class PilhaEncadeadaTeste {

	public static void main(String[] args) {
		
//		PilhaEncadeada pilha = new PilhaEncadeada();
//		pilha.push(100);
//		pilha.push(300);
//		pilha.push(200);
//		pilha.push(400);
//		pilha.push(700);
//		pilha.pop();
//		
//		System.out.println("Topo: "+pilha.top());
//		System.out.println("Tamanho: "+pilha.size());
//		System.out.println("Retorna a quantidade de nós: "+pilha.retornaQuantNO());
//
//		System.out.println("Retorna o Penultimo: "+pilha.encontrarPenultimo());
//		
//		
	    PilhaEncadeada pilha1 = new PilhaEncadeada();
	    pilha1.push(10);
	    pilha1.push(20);
	    pilha1.push(30);

	    PilhaEncadeada pilha2 = new PilhaEncadeada();
	    pilha2.push(40);
	    pilha2.push(50);
	    
	    PilhaEncadeada pilha3 = new PilhaEncadeada();
	    pilha3.push(20);
	    pilha3.push(30);

//	    System.out.println("Pilha 1 antes:");
//	    pilha1.imprimirPilha();  // Exibe: 30 -> 20 -> 10 -> null
//
//	    System.out.println("Pilha 2:");
//	    pilha2.imprimirPilha();  // Exibe: 50 -> 40 -> null

	    pilha1.pilha1empilha2(pilha2,pilha1);

	    System.out.println("Pilha 1 após inserir Pilha 2:");
	    pilha1.imprimirPilha();  // Exibe: 40 -> 50 -> 30 -> 20 -> 10 -> null
	    pilha1.toString();
//	    
//	    System.out.println(pilha1.toString());
	    
//	    pilha1.inserirPilha(pilha2);
//	    System.out.println(pilha1.toString());

	    
	}

}
