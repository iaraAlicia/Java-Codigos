package com.loiane.estruturadados.vetor;

public class FilaEncadeada {
	private NoFila inicio;
	private NoFila fim;
	private int totalDeElementos;
	
	//CRIA A FILA
	public FilaEncadeada() {
		this.inicio = null;
		this.fim = null;
		this.totalDeElementos = 0;
	}
	
	//ENFILEIRAR - INSERIR
	public void enqueue(Object elemento) {
		NoFila novo = new NoFila(elemento);
		if(this.isEmpty()) {
			this.inicio = novo;
		}else {
			this.fim.setProximo(novo);
		}
		this.fim = novo;
		this.totalDeElementos++;
	}
	//DESENFILEIRAR - REMOVER
	public void dequeue() {
		if(!this.isEmpty()) {
			this.inicio = this.inicio.getProximo();
			this.totalDeElementos--;
			if(totalDeElementos == 0) this.fim = null;
		}		
	}
	
	//VERIFICA SE É VAZIA
	public boolean isEmpty() {
		return this.totalDeElementos==0;
	}
	
	//TAMANHO DA LISTA
	public int size() {
		return this.totalDeElementos;
	}
	
	//PRIMEIRO DA FILA
	public Object front() {
		return this.inicio.getElemento();
	}	
	
	//TOSTRING - IMPRIMIR
	 @Override
		public String toString() {
			if(this.totalDeElementos==0) {
				return "[]";
			}
			StringBuilder builder = new StringBuilder("[");
			NoFila atual = this.inicio;
			for(int i=0; i<this.totalDeElementos-1; i++) {
				builder.append(atual.getElemento());
				builder.append(", ");
				atual = atual.getProximo();
			}
			builder.append(atual.getElemento());
			builder.append("]");
			
			//System.out.println("Início: "+this.inicio.getElemento());
			//System.out.println("Fim: "+this.fim.getElemento());
			return builder.toString();
		}
	
	public NoFila getInicio() {
		return inicio;
	}
	public void setInicio(NoFila inicio) {
		this.inicio = inicio;
	}
	public NoFila getFim() {
		return fim;
	}
	public void setFim(NoFila fim) {
		this.fim = fim;
	}
	public int getTamanho() {
		return totalDeElementos;
	}
	public void setTamanho(int tamanho) {
		this.totalDeElementos = tamanho;
	}
	
	
//	2. Inverter a ordem dos elementos da fila encadeada
//	Vamos inverter os ponteiros dos nós, e no final, o início da fila será o antigo último nó.
	
	public void inverterFila() {
	    NoFila anterior = null;
	    NoFila atual = this.getInicio();
	    NoFila proximo = null;
	    
	    this.fim = this.inicio; // O início atual se tornará o fim

	    while (atual != null) {
	        proximo = atual.getProximo(); // Armazena o próximo nó
	        atual.setProximo(anterior); // Inverte o ponteiro
	        anterior = atual; // Move o anterior para o atual
	        atual = proximo; // Move o atual para o próximo
	    }
	    
	    this.inicio = anterior; // O último nó se torna o novo início
	}

	

//1. Iterar sobre os elementos da fila encadeada sem modificá-la
//Para iterar sem alterar a fila, usaremos o método getInicio() para começar e um laço para percorrer os elementos:


public void iterarFila() {
    NoFila atual = this.getInicio(); // Pega o início da fila
    while (atual != null) {
        System.out.println(atual.getElemento()); // Imprime o elemento
        atual = atual.getProximo(); // Avança para o próximo nó
    }
}

////Contar quantos nós têm um valor específico na fila encadeada
//Aqui, faremos a iteração sobre os elementos da fila e contaremos quantos são iguais ao valor passado.
	
public int contarValorEspecifico(Object valor) {
    int contador = 0;
    NoFila atual = this.getInicio();
    
    while (atual != null) {
        if (atual.getElemento().equals(valor)) {
            contador++;
        }
        atual = atual.getProximo();
    }
    
    return contador;
}

//  4. Remover todos os elementos de valor par da fila encadeada
//  Vamos percorrer a fila e remover todos os nós cujo valor seja par. Considerando que o valor seja um número inteiro:
	public void removerPares() {
	    NoFila atual = this.getInicio();
	    NoFila anterior = null;
	    
	    while (atual != null) {
	        if ((int) atual.getElemento() % 2 == 0) { // Verifica se o valor é par
	            if (anterior == null) { // Remover o primeiro nó
	                this.inicio = atual.getProximo();
	            } else {
	                anterior.setProximo(atual.getProximo()); // Remove o nó atual
	            }
	            this.totalDeElementos--; // Decrementa o total de elementos
	        } else {
	            anterior = atual; // Atualiza o anterior
	        }
	        atual = atual.getProximo(); // Move para o próximo nó
	    }
	    
	    // Atualiza o fim da fila se necessário
	    if (this.inicio == null) {
	        this.fim = null;
	    }
	}

	
	
	
}
