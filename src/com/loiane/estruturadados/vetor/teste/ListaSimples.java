package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class ListaSimples {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(8);

		vetor.adiciona("bola");
		vetor.adiciona("casa");
		vetor.adiciona("bola");
		vetor.adiciona("teste");
		vetor.adiciona("bola");
		
		
		
		vetor.removeMultiplos();
		System.out.println("NOVA LISTA " +vetor.toString());
		
		
		
		
//		vetor1.adiciona("bola");
//		vetor1.adiciona("casa");
//		vetor1.adiciona("vaca");
//		vetor1.adiciona("cada");
//		vetor1.adiciona("dado");
//		
//
//		
//		vetor.concatenaLista(vetor1);
//		System.out.println("NOVA LISTA " +vetor.imprime());
//		
//		System.out.println("imprime os comuns entre si" + vetor1.concatLisIguais(vetor));
//		
//		
		
		
		
//		vetor.adicionaNaoDuplica("bola");
//		vetor.adicionaNaoDuplica("carrinho");
//		vetor.adicionaNaoDuplica("boneca");
//		vetor.adicionaNaoDuplica("Boneca");
//		vetor.adicionaNaoDuplica("casa");
//		vetor.tamanho();
//		System.out.println(vetor.toString());
//		System.out.println("busca inteligente: " +vetor.buscaInteligente("boneca"));
//		
//		System.out.println("busca por posição: " +vetor.busca(2));
//		System.out.println(vetor.toString());
//		System.out.println("seu elemento existe na posição: " +vetor.verifica("boneca"));
//		
//		System.out.println("adicionando alementos por posição: ");
//		vetor.adicionaPor(0, "peteca");
//		vetor.adicionaPor(0, "casinha");
//		System.out.println(vetor.imprime());
//		
//		System.out.println("removendo por posicao, posicao: " + vetor.removePor(0));
//		System.out.println(vetor.imprime());
//		
//		System.out.println("removendo por elemento, encontrado na posicao: " + vetor.removeEle("bola"));
//		System.out.println(vetor.imprime());
	}

}
