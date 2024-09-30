package com.loiane.estruturadados.vetor;

public class NoFila {
	
	private Object elemento;
	private NoFila proximo;
	
	public NoFila(Object elemento) {
		this.elemento = elemento;
	}

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	public NoFila getProximo() {
		return proximo;
	}

	public void setProximo(NoFila proximo) {
		this.proximo = proximo;
	}


	

	

}
