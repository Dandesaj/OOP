package Modelo;

public class Vehiculo {
	
	protected String marca;
	protected String modelo;
	protected String color;
	protected boolean  motorizado;
	
	public Vehiculo (String marca, String modelo, String color, boolean motorizado) {
		super();
		this.marca = marca; 
		this.color = color;
		this.modelo = modelo;
		this.motorizado = motorizado;
			
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isMotorizado() {
		return motorizado;
	}

	public void setMotorizado(boolean motorizado) {
		this.motorizado = motorizado;
	}
	
	
}
