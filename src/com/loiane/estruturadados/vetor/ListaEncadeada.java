package com.loiane.estruturadados.vetor;

public class ListaEncadeada {

	private NoLista inicio;
	private NoLista fim;
	public NoLista getInicio() {
		return inicio;
	}


	private int totalDeElementos;
	
	public void adicionaNoInicio(Object elemento) {
		NoLista novo = new NoLista(elemento, this.inicio);
		this.inicio = novo;
		if(this.totalDeElementos == 0) {
			this.fim = novo;
		}
		this.totalDeElementos++;
	}
	
	
	public void adicionaNoFim(Object elemento) {
		NoLista novo = new NoLista(elemento);
		if(this.totalDeElementos == 0) {
			this.adicionaNoInicio(elemento);
		}else {
			this.fim.setProximo(novo);
			this.fim = novo;
			this.totalDeElementos ++;
		}
	}
	
	public void adiciona(int posicao, Object elemento) {
		if(posicao==0) {
			this.adicionaNoInicio(elemento);
		}else if(posicao==this.totalDeElementos-1) {
			this.adicionaNoFim(elemento);
		}else{                                                           // A B D E  quero inserir o C antes do D, pego a referencia do anterior dele o B    
			NoLista anterior = this.pegaNo(posicao-1);                   // 1 2 3 4 5 a variavel anterior recebe a posição menos 1, no caso o B que ira depois referenciar o novo NO
			NoLista novo = new NoLista(elemento, anterior.getProximo()); // a variavel novo recebe o elemento e a referencia para D dessa forma posicao 3 recebe C apontando para D
			anterior.setProximo(novo);                                   // agora anterior B recebe proximo que é C 
			this.totalDeElementos++;
		}
	}
	
	public void removeDoComeco() {
		if(this.totalDeElementos>0) {
			this.inicio = this.inicio.getProximo();
			this.totalDeElementos--;
		}
		if(this.totalDeElementos==0) this.fim = null;	
	}
	
	public void removeDoFinal() {
		if(this.getTotalDeElementos()==0) {
			System.out.println("Lista vazia!");
		}else if(this.totalDeElementos == 1) {
			this.removeDoComeco();
		}else {
			NoLista anterior = this.pegaNo(this.totalDeElementos-2);
			anterior.setProximo(null);
			this.fim = anterior;
			this.totalDeElementos--;
		}
	}
	
	 public boolean remove(int posicao) {
		if(this.posicaoValida(posicao)) {
			if(posicao == 0) {
				this.removeDoComeco();
				return true;
			}else if(posicao == this.totalDeElementos-1) {
				this.removeDoFinal();
				return true;
			}else {
				NoLista anterior  = this.pegaNo(posicao-1);
				NoLista atual = anterior.getProximo();
				NoLista proximo = atual.getProximo();
				anterior.setProximo(proximo);
				this.totalDeElementos--;
				return true;
			}
		}else {
			return false;
		}
	}
	
	public NoLista pegaNo (int posicao) {
		if(!this.posicaoValida(posicao)) {
			throw new IllegalArgumentException("Posição Inálida!");
		}
		NoLista atual = this.inicio;
		for(int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}
	
	public Object pega(int posicao) {
		return this.pegaNo(posicao).getElemento();
	}
	
	@Override
	public String toString() {
		if(this.totalDeElementos==0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		NoLista atual = this.inicio;
		for(int i=0; i<this.totalDeElementos-1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProximo();
		}
		builder.append(atual.getElemento());
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
	

	public void setInicio(NoLista inicio) {
		this.inicio = inicio;
	}

	public NoLista getFim() {
		return fim;
	}

	public void setFim(NoLista fim) {
		this.fim = fim;
	}
	
	public int getTotalDeElementos() {
		return totalDeElementos;
	}

	public void setTotalDeElementos(int totalDeElementos) {
		this.totalDeElementos = totalDeElementos;
	}
	
	
	
//	------------------ QUESTÕES ---------------------
//	1) - Implemente um método para verificar se a lista contém 
//	um determinado elemento
	
	public boolean contem(Object elemento) {
	    NoLista atual = this.inicio;
	    while (atual != null) {
	        if (atual.getElemento().equals(elemento)) {
	            return true;
	        }
	        atual = atual.getProximo();
	    }
	    return false;
	}
	
//	2) - Implemente um método que retorne o índice de um determinado 
//	elemento na lista. Caso o elemento não esteja presente, retorne -1.
	
	
	public int indiceDe(Object elemento) {
	    NoLista atual = this.inicio;
	    int indice = 0;
	    while (atual != null) {
	        if (atual.getElemento().equals(elemento)) {
	            return indice;
	        }
	        atual = atual.getProximo();
	        indice++;
	    }
	    return -1;
	}
//	
//	3) - Implemente um método que inverta a lista encadeada, de modo 
//	que o primeiro elemento se torne o último e vice-versa.
	
	public void inverte() {
	    NoLista anterior = null;
	    NoLista atual = this.inicio;
	    NoLista proximo = null;
	    this.fim = this.inicio;
	    
	    while (atual != null) {
	        proximo = atual.getProximo();
	        atual.setProximo(anterior);
	        anterior = atual;
	        atual = proximo;
	    }
	    this.inicio = anterior;
	}
	
//	4) - Aqui está um método que recebe um número x de células (nós) 
//	da listaA e os move para a listaB, mantendo a integridade de ambas 
//	as listas. A ideia é "cortar" os primeiros x elementos da listaA 
//	e adicioná-los ao final da listaB.

	public void moveElementos(ListaEncadeada listaA, ListaEncadeada listaB, int x) {
	    if (x > listaA.getTotalDeElementos()) {
	        throw new IllegalArgumentException("Número de elementos a mover é maior que o tamanho da listaA");
	    }

	    for (int i = 0; i < x; i++) {
	        // Pega o primeiro elemento de listaA
	        Object elemento = listaA.pega(0);
	        
	        // Remove o primeiro elemento de listaA
	        listaA.removeDoComeco();
	        
	        // Adiciona esse elemento no fim da listaB
	        listaB.adicionaNoFim(elemento);
	    }
	}

//	5) - Aqui está a implementação do método inverteLista que inverte 
//	os elementos da lista L1, remove os números pares, e coloca
//	os números ímpares na lista L2. No final, imprime os elementos de L2.
	
	public void inverteListaRemoveParesSemStack(ListaEncadeada L1, ListaEncadeada L2) {
	    // Primeiro, percorremos L1 e armazenamos os elementos em uma lista temporária para inverter
	    NoLista atual = L1.getInicio();
	    ArrayList<Object> elementos = new ArrayList<>();

	    // Armazenando todos os elementos de L1
	    while (atual != null) {
	        elementos.add(atual.getElemento());
	        atual = atual.getProximo();
	    }

	    // Agora, percorremos a lista temporária de trás para frente (para inverter)
	    for (int i = elementos.size() - 1; i >= 0; i--) {
	        Object elemento = elementos.get(i);
	        if (elemento instanceof Integer) {
	            int valor = (int) elemento;
	            if (valor % 2 != 0) { // Se o número for ímpar
	                L2.adicionaNoFim(valor);
	            }
	        }
	    }

	    // Imprime L2
	    System.out.println(L2.toString());
	}

	
	
	
}
