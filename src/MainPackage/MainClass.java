package MainPackage;
import Modelo.Auto;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Auto instanciaAuto = new Auto();
		
		//using getter and setter method
		System.out.println("valor marca = "+ instanciaAuto.getMarca());
		instanciaAuto.setMarca("Audi");
		System.out.println("valor marca = "+ instanciaAuto.getMarca());
		
		instanciaAuto.encenderMotor();
		instanciaAuto.setVelocidadActual(100);
		System.out.println("motor encendido: "+ instanciaAuto.isMotorEncendido());
		System.out.println("velocidad: "+ instanciaAuto.getVelocidadActual());
		
		instanciaAuto.frenar(100000);
		instanciaAuto.apagarMotor();
		System.out.println("\nMotor encendido: "+ instanciaAuto.isMotorEncendido());
		System.out.println("velocidad: "+ instanciaAuto.getVelocidadActual());
		
	}

}
