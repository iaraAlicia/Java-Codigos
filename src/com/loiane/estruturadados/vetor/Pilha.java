package com.loiane.estruturadados.vetor;

import java.util.Arrays;

public class Pilha {
	
	private Object elementos[];
	private int topo;
	
	public Pilha(int capacidade) {
		this.elementos = new Object[capacidade];
		this.topo=-1;	
	}	
	
	public boolean push(Object elemento) {
		if(this.topo < this.elementos.length) {
			this.topo++;
			this.elementos[this.topo] = elemento;
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		return this.topo<0;
	}
	
	public int size() {
		if(this.isEmpty()) return  0; // porque a necessidade se tiver vazia, já vai ser 0
		return this.topo+1;
	}
	public Object topo() {
		if(this.isEmpty()) return null;
		return this.elementos[topo];
	}
	
	public Object pop() {
		if(this.isEmpty()) return null;
		return this.elementos[this.topo--];
	}
	
	
	
	
	
	
	
	public int topoNum() {
		return this.topo;
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
	
//	Perguntas sobre pilhas simples:
//	Como você pode verificar se o elemento do topo da pilha é um valor específico 
//	(por exemplo, 10)?
	
	public Object boscaEle(Object elemento) {
		if(this.isEmpty()) return  -1;
		
		for(int i =0; i < this.size(); i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
//  Implemente um método para duplicar o valor do elemento que está no topo da pilha.
	
	public boolean Duplicatopo() {
		if(this.isEmpty()) return false;
		
		this.push(this.topo());
		return true;
	}
//	escreva uma função para inverter a ordem de todos os elementos da pilha.

	public void inverteOrdem() {
		Object[] Novoelemento = new Object[size()];
		for(int i =0; i < Novoelemento.length; i++) {
			Novoelemento[i] = this.pop();
		}
	   for (int i = 0; i < Novoelemento.length; i++) {
	        this.push(Novoelemento[i]);
	    }
	}
	
//	Como você pode somar todos os elementos da pilha sem removê-los?
	
	public  int  SumAll() {
		if(this.isEmpty()) return -1;
		
		int soma = 0;
		Object[] Novoelemento = new Object[size()];
		
		for(int i =0; i < Novoelemento.length ; i++) {
			  Object elemento = this.elementos[this.topo--];
			  
			   if (elemento instanceof Integer) {  // Verifica se é um número inteiro
		            soma += (Integer) elemento;
		        }
			   Novoelemento[i++] = elemento;
		}
		
	   return soma;
	}
	

}
