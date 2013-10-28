package Ejercicios;

import java.util.Scanner;

/*
 * Escribir un programa que pregunte al usuario su nombre, y luego lo salude.
 */

public class Ejercicio1 {

	public static void main(String[] args) {
	
		 System.out.print("Hola, ¿Como te llamas?");
        
		 Scanner teclado = new Scanner(System.in);
		 String nombre;
		                
		 nombre=teclado.nextLine();
		                
		 System.out.print("Buenas, "+nombre);	

		 teclado.close();
		 
	}

}
