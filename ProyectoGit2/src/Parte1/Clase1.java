package Parte1;

import java.util.Random;

public class Clase1 {

	public static void main(String[] args) {
		
		Random rng = new Random();
		int num = rng.nextInt(50)+1;
		
		System.out.println("El numero de la loteria de hoy es "+num );
	}

}
