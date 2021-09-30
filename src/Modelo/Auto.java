package Modelo;

public class Auto {

	String marca;
	String Modelo;
	String Color;
	int velocidadActual;
	int velocidadMaxima;
	boolean motorEncendido;

	void encenderMotor() {
		this.motorEncendido = true;
		
	}
	
	void aumentarVelocidad() {
		while(this.velocidadActual<this.velocidadMaxima) {
			velocidadActual++;
			wait(1);
		}
	}
	
	void frenar() {
		
	}
	
	void apagarMotor() {
		
	}
}
