package Modelo;

public class Conductor {
	private String nombre;
	private Auto suAuto;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Auto getSuAuto() {
		return suAuto;
	}
	public void setSuAuto(Auto suAuto) {
		this.suAuto = suAuto;
	}
	@Override
	public String toString() {
		return "\nConductor \n[nombre=" + nombre + ", suAuto=" + suAuto + "]";
	}
	
	
}
