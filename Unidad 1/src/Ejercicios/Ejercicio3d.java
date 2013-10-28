package Ejercicios;

import java.util.Scanner;

/*
 * Calculen el área de un rectángulo (alineado con los ejes x e y) dadas sus coordenadas x1,x2,y1,y2.
 */

public class Ejercicio3d {

	public static void main(String[] args) {

		Scanner teclado = new Scanner( System.in ); 
		
        int x1,x2,y1,y2,area; 
                                        
        System.out.print( "Introduzca la abscisa x1: "); 
        
        x1 = teclado.nextInt(); 
        
        System.out.print( "Introduzca la abscisa x2 (mayor que x1): "); 
        
        x2 = teclado.nextInt(); 
        
        System.out.print( "Introduzca la ordenada y1: "); 
        
        y1 = teclado.nextInt(); 
        
        System.out.print( "Introduzca la ordenada y2 (mayor que y1): "); 
        
        y2 = teclado.nextInt(); 
        
        teclado.close();
        
        area = (x2-x1) * (y2-y1); 
        
        System.out.println( "--------RESULTADOS--------"); 
        
        System.out.println( "Área: " + area );		
	}

}
