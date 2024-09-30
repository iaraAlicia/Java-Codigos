package com.loiane.estruturadados.vetor;

public class NoLista {
	
	private NoLista proximo;
	private Object elemento;
	
	public NoLista( Object elemento, NoLista proximo) {
		super();
		this.proximo = proximo;
		this.elemento = elemento;
	}
	public NoLista( Object elemento) {
		this.elemento = elemento;
	}

	public NoLista getProximo() {
		return proximo;
	}

	public void setProximo(NoLista proximo) {
		this.proximo = proximo;
	}

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}
	

	
}
