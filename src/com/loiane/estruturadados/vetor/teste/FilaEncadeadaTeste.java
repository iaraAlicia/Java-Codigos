package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.FilaEncadeada;
import com.loiane.estruturadados.vetor.Vetor;

public class FilaEncadeadaTeste {

	public static void main(String[] args) {

			FilaEncadeada fila = new FilaEncadeada();
			fila.enqueue(3);
			fila.enqueue(2);
			fila.enqueue(4);
			fila.enqueue(1);
			System.out.println(fila);
			fila.dequeue();
			
			System.out.println(fila);
			System.out.println(fila.size());
			System.out.println("Primeiro: "+fila.front());
			
			fila.inverterFila();
			System.out.println("Primeiro: " + fila);
			System.out.println("Ocorrencias de um objeto: " + fila.contarValorEspecifico(1));;
			
			fila.removerPares();
			System.out.println("removePares: " + fila);
	}

}
