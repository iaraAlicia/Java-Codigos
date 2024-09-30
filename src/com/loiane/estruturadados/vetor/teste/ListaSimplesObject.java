package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.VetorObjetos;

public class ListaSimplesObject {

	public static void main(String[] args) {
		
		VetorObjetos vetor = new VetorObjetos(3);
		
		vetor.adiciona("bola");
		vetor.adiciona("carrinho");
		vetor.adiciona("boneca");
		vetor.tamanho();
		System.out.println(vetor.toString());
		System.out.println(vetor.busca(2));
		System.out.println("seu elemento existe na posição: " +vetor.verifica("boneca"));
		vetor.adicionaPor(0, "peteca");
		vetor.adicionaPor(0, "casinha");
		System.out.println(vetor.imprime());
		
		System.out.println("removendo por posicao: " + vetor.removePor(0));
		System.out.println(vetor.imprime());
		
		System.out.println("removendo por elemento: " + vetor.removeEle("peteca"));
		System.out.println(vetor.imprime());

	}

}
