package Ejercicios;

import java.util.Scanner;

/* 
 * Calculen el perímetro y área de un círculo dado su radio.
 */

public class Ejercicio3b {

	public static void main(String[] args) {

		Scanner teclado = new Scanner( System.in );
        
        int radio; 
        final double PI = Math.PI; 
        double perimetro, area; 
                        
        System.out.print( "Introduzca el Radio del círculo: ");       
        
        radio = teclado.nextInt(); 
        
        teclado.close(); 
        
        perimetro = 2 * PI * radio; 
        area = PI * Math.pow(radio, 2);
        
        System.out.println( "--------RESULTADOS--------"); 
        
        System.out.println( "Perímetro: " + perimetro ); 
        System.out.println( "Área: " + area );
	
        
	}

}
