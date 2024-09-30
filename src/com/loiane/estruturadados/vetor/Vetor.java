package com.loiane.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;		
	}	
	
	public boolean adiciona(String elemento) {
		aumentaCapacidade();
			if(this.tamanho < this.elementos.length) {
				this.elementos[this.tamanho] = elemento;
				this.tamanho++;
				return true;
			}
			return false;
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
	
    public String busca(int posicao) {
	   if(posicao < 0 && posicao > this.tamanho) {
		   throw new IllegalArgumentException();
	   }else {
		   return this.elementos[posicao];
	   }
	 
    }
	
	public int verifica(String elemento) {
		for(int i=0; i<this.tamanho; i++) {
			if(this.elementos[i].equalsIgnoreCase(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean adicionaPor(int posicao, String elemento) {
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
		return true;
	}
	
	public void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			String[] elementosNovos =  new String[this.elementos.length*2];
			for(int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public int removePor(int posicao) {
	   if(posicao < 0 && posicao > this.tamanho) {
		   throw new IllegalArgumentException();
	   }else {
		   for(int i = posicao; i < this.tamanho; i++)  {
			   this.elementos[i] = this.elementos[i+1];
		   }
		   this.tamanho--;
	   }
	// 1 2 3 4 5 6 7
	// a b c d e
	return posicao;
	}
	
	public int removeEle(String elemento) {
		int posicao = this.verifica(elemento);
		if(posicao >=0) {
			this.removePor(posicao);
			return posicao;
		}	
		return -1;
	}
	


//	--------------------------	QUESTÕES --------------------------				
//
//	1) - Inserção sem duplicação: Modifique o método adiciona para que 
//	ele não permita a inserção de elementos duplicados na lista. Como  
//	você trataria essa situação?
	
	public boolean adicionaNaoDuplica(String elemento) {
		aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			if(this.verifica(elemento) > -1) {
				int posicao = this.verifica(elemento);
				this.removePor(posicao);
			}else {
				return false;
			}
		this.elementos[this.tamanho] = elemento;
		this.tamanho++;
		return true;
		}

	return false;
	}
	
//	2) Busca eficiente: Implemente um método de busca que, ao invés 
//	de retornar apenas a posição do elemento, retorne uma mensagem 
//	dizendo se o elemento está ou não na lista.
		
		
	public String buscaInteligente(String elemento) {
		int posicao = this.verifica(elemento);
		if(posicao > -1) {
			return "elemento encontrado na posicao: " + posicao;
		}else {
			return "elemento não encontrado";
		}
		
	}
		
		
//	3) - Concatenação de listas: Crie um método que receba outra lista 
//	do tipo Vetor e a concatene com a lista original, mantendo todos 
//	os elementos.	
		
		
    public void concatenaLista(Vetor novaLista) {	
    	for(int i =0; i < novaLista.elementos.length; i++) {
    		this.adiciona(novaLista.busca(i));
    	}
    }
    
    
//    4) - Interseção de listas: Implemente um método que receba outra 
//    lista do tipo Vetor e retorne uma nova lista contendo os elementos 
//    comuns entre ambas.

    public Vetor concatLisIguais(Vetor novaLista) {	
    	Vetor listaComuns = new Vetor(this.tamanho / 2);
    	for(int i =0; i < novaLista.tamanho(); i++) {
    		String elementoAtual = novaLista.busca(i);
    		if(this.verifica(elementoAtual) > -1 && listaComuns.verifica( elementoAtual) == -1) {
				listaComuns.adiciona( elementoAtual );
    		}
    	}
    	return listaComuns;
    }
    
    
//    5) - Remover múltiplos elementos: Crie um método que remova todos 
//    os elementos de um determinado valor da lista, não apenas o 
//    primeiro.
    
    //COMENTARIO: remove e tudo menino, qualquer variavel que sor duplicada é removida todas as ocorrencias
    public boolean removeMultiplos() {
    	for(int i =0; i < tamanho(); i++) {
    		String elementoAtual = this.busca(i);
    		if(this.verifica(elementoAtual) > -1) {
				this.removeEle(elementoAtual);
    		}
    	}
       	return true;
    }


}


