package MainPackage;
import Modelo.Auto;
import Modelo.Conductor;
import Modelo.SistemaSonido;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Auto instanciaAuto = new Auto("marca","modelo","color",0,20,true);
		
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
		
		instanciaAuto.isMotorizado(); //funcion heredada de Vehiculo
			
		
		//Instanciando la clase asociada; SistemaSonido
		SistemaSonido instanciaSSonido = new SistemaSonido();
		instanciaSSonido.setVolumenMaximo(500);		
		instanciaAuto.setSistemaSonido(instanciaSSonido);
		
		
		System.out.println(instanciaAuto.toString());
		
		
		//Instanciando la clase asociada; Conductor
		Conductor instanciaConductor = new Conductor();
		instanciaConductor.setNombre("Pistero");
		instanciaConductor.setSuAuto(instanciaAuto);
		
		System.out.println(instanciaConductor.toString());
		
		
	}

	

}
