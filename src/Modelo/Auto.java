package Modelo;
import Modelo.SistemaSonido;

public class Auto extends Vehiculo{
	
	private String marca;
	private String modelo;
	private String color;
	private int velocidadActual;
	private int velocidadMaxima;
	private boolean motorEncendido;
	private SistemaSonido sistemaSonido;
	
	//Constructor Vacio
	public Auto() {
		
	}
	
	//Constructor
	public Auto(String marca, String modelo, String color, 
				int velocidadActual, int velocidadMaxima, boolean motorEncendido){{
					
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidadActual = velocidadActual;
		this.velocidadMaxima = velocidadMaxima;
		this.motorEncendido = motorEncendido; 
	}
		
	}
	

	//ENCENDER Y APGAR MOTOR
	public void encenderMotor() {
		this.motorEncendido = true;		
	}
	public void apagarMotor() {
		this.motorEncendido = false;	
		velocidadActual = 0;
	}
	
	//METODOS SOBRECARGADOS
	public void aumentarVelocidad(int velocidad) {
		setVelocidadActual(getVelocidadActual()+ velocidad);
	}
	
	public void aumentarVelocidad() {
		setVelocidadActual(getVelocidadActual()+ 30);
	}
	
	public void aumentarVelocidad(int n, int m) {
		if(getVelocidadActual() > 30 && getVelocidadActual() <= 150) {
			setVelocidadActual(getVelocidadActual()+ 10);
		}
		if(getVelocidadActual()>150) {
			setVelocidadActual(getVelocidadActual()+ 1);
		}
		
	}
	
	
	public void frenar(int velocidad) {
		
		if(velocidad>0 && velocidad<=getVelocidadActual()) {
			setVelocidadActual(getVelocidadActual()- velocidad);
		}else if(velocidad > getVelocidadActual()) {
			setVelocidadActual(0);
		}
			
		
	}
	
	
	
	public SistemaSonido getSistemaSonido() {
		return sistemaSonido;
	}

	public void setSistemaSonido(SistemaSonido sistemaSonido) {
		this.sistemaSonido = sistemaSonido;
	}

	//GETTER Y SETTER 
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return marca;
	}
	public void setModelo(String modelo) {
		this.marca = modelo;
	}	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getVelocidadActual() {
		return velocidadActual;
	}
	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
		
	public boolean isMotorEncendido() {
		return motorEncendido;
	}
	public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

	
	//Override del metodo toString() heredada de la clase objecto de Java
	
	@Override
	public String toString() {
		return "\nAuto \n[marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", \nvelocidadActual="
				+ velocidadActual + ", velocidadMaxima=" + velocidadMaxima + ", \nmotorEncendido=" + motorEncendido
				+ ", \n\nsistemaSonido=" + sistemaSonido + "]";
	}
	
	
	
	
	
}
