package Ejercicios;

import java.util.Scanner;

/*
 * Escribir un programa que pregunte al usuario dos n�meros y luego muestre la suma, el producto y la media de los dos n�meros.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		 float numero1,numero2;
         float suma;
         float producto;
         float media;
         
         Scanner teclado = new Scanner(System.in);
         
         System.out.print("Dame un n�mero: ");
         numero1=teclado.nextFloat();
         System.out.print("Dame otro n�mero: ");
         numero2=teclado.nextFloat();
         
         suma = numero1+numero2;
         producto = numero1*numero2;
         media = (numero1+numero2)/2;
         
         System.out.println("--------RESULTADOS--------");
         System.out.println("N�mero 1: " + numero1);
         System.out.println("N�mero 2: " + numero2);
         System.out.println("Suma: " + suma);
         System.out.println("Producto: " + producto);
         System.out.println("Media: " + media);
         
         teclado.close();		
	}

}
