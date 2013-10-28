package Ejercicios;

import java.util.Scanner;

/*
 *Calculen el volumen de una esfera dado su radio.
*/

public class Ejercicio3c {

	public static void main(String[] args) {

		 Scanner teclado = new Scanner( System.in );
	        
	     int radio;
	     double volumen;
	        
	     System.out.print( "Introduzca el Radio de la esfera (cm): ");
	        
	     radio = teclado.nextInt(); 
	        
	     teclado.close(); 
	        
	     volumen = (4 * Math.PI * Math.pow(radio, 3))/3;
	        
	     System.out.println( "--------RESULTADOS--------");
	        
	     System.out.println( "Volumen: " + Math.round(volumen*100)/100.0);			
	}

}
