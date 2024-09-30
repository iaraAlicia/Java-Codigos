package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.ListaEncadeada;

public class ListaEncadeadaTeste {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		ListaEncadeada lista2 = new ListaEncadeada();
		
		lista.adicionaNoInicio(1);
		lista.adicionaNoInicio(2);
		lista.adicionaNoInicio(2);
		lista.adicionaNoInicio(3);
		lista.adicionaNoInicio(4);
		System.out.println(lista.toString());
		
		lista2.adicionaNoInicio(6);
		lista2.adicionaNoInicio(5);
		lista2.adicionaNoInicio(4);
		System.out.println(lista2.toString());
	
		lista.moveElementos(lista, lista2,1);
		System.out.println(lista.toString());
//		System.out.println(lista.toString());
		
//		System.out.println("Comtem determinado elemento: " + lista.contem("SERRITa"));
//		lista.inverte();
//		System.out.println(lista.toString());

//		System.out.println("Pega No: " + lista.pega(4));
//		lista.removeDoComeco();
//		System.out.println(lista.toString());
//		lista.removeDoFinal();
//		System.out.println(lista.toString());
//		lista.remove(2);
//		System.out.println(lista.toString());
	}

}
