package Ejercicios;

import java.util.Scanner;

/*
 * Crea un programa que pida un peso en Kilogramos y realice la conversión a onzas, sabiendo que 1 Kilogramo (Kg) = 35.2739619 Onzas (oz)
 */

public class Ejercicio4 {

	public static void main(String[] args) {
		
		float kg;
        double oz;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Escribe un peso en Kg: ");
        kg=teclado.nextFloat();
                
        oz = 35.2739619 * kg;
        
        System.out.print( kg + " Kg son " + oz + " Oz.");
        
        teclado.close();

	}

}
