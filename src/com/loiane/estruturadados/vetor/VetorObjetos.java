package com.loiane.estruturadados.vetor;

import java.util.Arrays;

public class VetorObjetos {
	
	private Object[] elementos;
	private int tamanho;
	
	public VetorObjetos(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;		
	}	
	
	public void adiciona(Object elemento) {
		aumentaCapacidade();
		for(int i=0; i < elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				this.tamanho++;
				break;
			}
			
		}
	}
	public String imprime() {
		return Arrays.toString(elementos);
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for(int i=0; i<this.tamanho-1;i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if(this.tamanho>0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]");
		return s.toString();
		
	}
	
   public Object busca(int posicao) {
	   if(posicao < 0 && posicao > this.tamanho) {
		   throw new IllegalArgumentException();
	   }else {
		   return this.elementos[posicao];
	   }
	 
   }
	
	public int verifica(Object elemento) {
		for(int i=0; i<this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean adicionaPor(int posicao, Object elemento) {
			aumentaCapacidade();
		   if(posicao < 0 && posicao > this.tamanho) {
			   throw new IllegalArgumentException();
		   }else {
			   for(int i = this.tamanho-1; i >= posicao; i--) {
				   this.elementos[i+1] = this.elementos[i];
			   }
			   this.elementos[posicao] = elemento;
			   this.tamanho++;
		   }
		// 1 2 3 4 5 6 7
		// a b c d e
		return false;
	}
	
	public void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			Object[] elementosNovos =  new Object[this.elementos.length*2];
			for(int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public boolean removePor(int posicao) {
	   if(posicao < 0 && posicao > this.tamanho) {
		   throw new IllegalArgumentException();
	   }else {
		   for(int i = posicao; i < this.tamanho; i++) {
			   this.elementos[i] = this.elementos[i+1];
		   }
		   this.tamanho--;
	   }
	// 1 2 3 4 5 6 7
	// a b c d e
	return false;
	}
	
	public int removeEle(Object elemento) {
		int posicao = this.verifica(elemento);
		if(posicao >=0) {
			this.removePor(posicao);
			return posicao;
		}	
		return -1;
	}
	
}
