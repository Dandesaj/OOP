package Modelo;

import java.util.List;

public class SistemaSonido {
	
	private Integer volumenMaximo;
	private Integer volumenMinimo;
	private Integer volumenActual;
	private List<String>  funciones;
	private String funcionActual;
	
	
	public Integer getVolumenMaximo() {
		return volumenMaximo;
	}


	public void setVolumenMaximo(Integer volumenMaximo) {
		this.volumenMaximo = volumenMaximo;
	}


	public Integer getVolumenMinimo() {
		return volumenMinimo;
	}


	public void setVolumenMinimo(Integer volumenMinimo) {
		this.volumenMinimo = volumenMinimo;
	}


	public Integer getVolumenActual() {
		return volumenActual;
	}


	public void setVolumenActual(Integer volumenActual) {
		this.volumenActual = volumenActual;
	}


	public List<String> getFunciones() {
		return funciones;
	}


	public void setFunciones(List<String> funciones) {
		this.funciones = funciones;
	}


	public String getFuncionActual() {
		return funcionActual;
	}


	public void setFuncionActual(String funcionActual) {
		this.funcionActual = funcionActual;
	}


	
	@Override
	public String toString() {
		return "\nSistemaSonido [\nvolumenMaximo=" + volumenMaximo + ", volumenMinimo=" + volumenMinimo + ", \nvolumenActual="
				+ volumenActual + ", \nfunciones=" + funciones + ", \nfuncionActual=" + funcionActual + "]";
	}



}
