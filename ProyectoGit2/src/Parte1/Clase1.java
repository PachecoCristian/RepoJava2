package Parte1;

import java.util.Random;

public class Clase1 {

	public static void main(String[] args) {
		
		Random rng = new Random();
		
		System.out.println("El numero de la loteria de hoy es "+(rng.nextInt(50)+1));
	}

}
