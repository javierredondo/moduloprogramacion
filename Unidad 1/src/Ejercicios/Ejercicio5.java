package Ejercicios;

import java.util.Scanner;

/*
 * Crea un programa que pida el tama�o de un archivo (Mbytes) y la velocidad de una l�nea de datos (Mbps), y muestre el tiempo que tardar� en transmitirlo usando dicha l�nea.
 */

public class Ejercicio5 {

	public static void main(String[] args) {

		double tama�o,velocidad;
        double tiempo;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Escribe el tama�o del archivo en Mbytes: ");
        tama�o=teclado.nextDouble();
        
        System.out.print("Escribe la velocidad de la l�nea de datos en Mbps: ");
        velocidad=teclado.nextDouble();
        
        tiempo = (tama�o*8)/velocidad;  
        
        System.out.print("El tiempo que tarda en transmitir el archivo es: " + tiempo);
        
        teclado.close();

	}
	

}
