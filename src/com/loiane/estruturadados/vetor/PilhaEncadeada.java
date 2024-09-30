package com.loiane.estruturadados.vetor;

import java.util.Arrays;

import com.loiane.estruturadados.vetor.NoPilha;
public class PilhaEncadeada {
	
	private NoPilha topo;
	private int tamanho;
	
	public PilhaEncadeada() {
		this.topo = null;
		this.tamanho = 0;
	}
	
	public void push(Object elemento) {
		NoPilha novo = new NoPilha(elemento, this.topo); // Tem que seguir a estrutura do NoPilha, lá pede pra quando mexer   dizer quem é o elemento e seu proximo, no caso anterior, porque eu ensiro um novo elemento e o topo vira anterior														
		this.topo = novo;                                // e o novo no vira o topo, e quanto eu quiser ensirir um novo elemento, faz o mesmo, colocar o elemento e indica seu proximo no caso o topo
		this.tamanho++;                                  // incrementa o tamanho, tamanho só é mexido nessa pagina
	}
	
	public boolean isEmpty() {
		return this.topo==null;
	}
	
	public int size() {
		return this.tamanho;
	}
	
	public Object top() {
		return this.topo.getElemento();
	}

	public Object pop() {
		if(this.isEmpty()) return null;
		
		Object elementoTopo = this.topo.getElemento(); // Armazena o elemento do topo
		this.topo = this.topo.getProximo();			   // O topo agora passa a ser o próximo nó. no caso o anterior
		this.tamanho--;                                //decrementa para tirar o ultimo elemento
		return elementoTopo;                           //retorna elemento removido?
	}	
	
    public void imprimirPilha() {
        NoPilha atual = topo;
        while (atual != null) {
            System.out.print(atual.getElemento() + " -> ");
            atual = atual.proximo;
        }
        System.out.println("null");
    }
	
	public String toString() {
		int contador = 0;
		NoPilha atual = topo;
	
		
		StringBuilder s = new StringBuilder();
		s.append("|------Pilha-------|");
		while(atual != null) {
			contador ++;
			s.append("\n|");
			s.append(atual.getElemento()); 
	        atual = atual.proximo;
			s.append("|");
		}
		s.append("\n|------Fim-------|");
		return s.toString();
	}
	
	
//	Perguntas sobre pilhas simples:

	//	Como você pode verificar se o elemento do topo da pilha é um valor específico
	//(por exemplo, 10)?
	
	public int retornaQuantNO() {
		if(this.isEmpty()) return -1;
		
		int contador = 0;
		NoPilha atual = topo;
		
		while(atual != null) {
			contador ++;
			atual = atual.getProximo();
		}
		return contador*2; // solução pifia, mais funciona, contador*2 porque cada elemento tem 2 nós, o atual e o get proximo
	}
	
//	Escreva uma função que encontre o penúltimo nó da pilha encadeada.
	
	    public Object encontrarPenultimo() {
	       if(isEmpty()) return null;
	
	        NoPilha atual = topo;
	  	  
	    	NoPilha penultimo = null;  // Para armazenar o penúltimo nó

		    // Percorre a pilha até encontrar o último nó
		    while (atual.proximo != null) {
		        penultimo = atual;      // Atualiza o penúltimo nó
		        atual = atual.proximo;  // Move para o próximo nó
		    }
		
		    return penultimo.getElemento();  // Retorna o penúltimo nó
	    }
	    
//	    Como você pode verificar se um determinado valor está presente na pilha encadeada 
	  
	    public void inserirPilha(PilhaEncadeada novaPilha) {
	      
	        // Passo 1: Inverter a pilha nova para manter a ordem correta dos elementos
	        PilhaEncadeada pilhaInvertida = new PilhaEncadeada();
	        while (!novaPilha.isEmpty()) {
	            pilhaInvertida.push(novaPilha.pop()); // Inverte a nova pilha
	        }

	        // Passo 2: Inserir os elementos da pilha invertida na pilha original
	        while (!pilhaInvertida.isEmpty()) {
	            this.push(pilhaInvertida.pop()); // Insere os elementos da pilha invertida
	        
	        }
	    
	    }
	    public void pilha1empilha2(PilhaEncadeada novaPilha, PilhaEncadeada pilhaInvertida) {
	        // Passo 1: Inverter a novaPilha para manter a ordem correta dos elementos
	        while (!novaPilha.isEmpty()) {
	            pilhaInvertida.push(novaPilha.pop()); // Inverte a nova pilha
	        }

	        // Passo 2: Inserir os elementos da pilha invertida na pilha original (this)
	        while (!pilhaInvertida.isEmpty()) {
	            this.push(pilhaInvertida.pop()); // Insere os elementos da pilha invertida
	        }
	    }

	    
	    public void inverterPilha(PilhaEncadeada novaPilha) {
	        if (isEmpty()) { return; }

	        PilhaEncadeada pilhaAuxiliar = new PilhaEncadeada();

	        while (!this.isEmpty()) {
	            pilhaAuxiliar.push(this.pop());
	        }
	        while (!pilhaAuxiliar.isEmpty()) {
	            this.push(pilhaAuxiliar.pop());
	        }
	    }
	
	    
	    
	    
}
