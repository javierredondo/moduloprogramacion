package Ejercicios;

import java.util.Scanner;

/*
 * Crea un programa que pida el tamaño de un archivo (Mbytes) y la velocidad de una línea de datos (Mbps), y muestre el tiempo que tardará en transmitirlo usando dicha línea.
 */

public class Ejercicio5 {

	public static void main(String[] args) {

		double tamaño,velocidad;
        double tiempo;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Escribe el tamaño del archivo en Mbytes: ");
        tamaño=teclado.nextDouble();
        
        System.out.print("Escribe la velocidad de la línea de datos en Mbps: ");
        velocidad=teclado.nextDouble();
        
        tiempo = (tamaño*8)/velocidad;  
        
        System.out.print("El tiempo que tarda en transmitir el archivo es: " + tiempo);
        
        teclado.close();

	}
	

}
