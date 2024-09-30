package com.loiane.estruturadados.vetor;

import java.util.Arrays;

public class NoPilha {
	
	private Object elemento;
	public NoPilha proximo;	
	
	public NoPilha(Object elemento, NoPilha proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
	}
	public Object getElemento() {
		return elemento;
	}
	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}
	public NoPilha getProximo() {
		return proximo;
	}
	public void setProximo(NoPilha proximo) {
		this.proximo = proximo;
	}


	
}
