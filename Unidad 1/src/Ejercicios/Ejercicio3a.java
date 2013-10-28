package Ejercicios;

import java.util.Scanner;

/* 
 * Calculen el perímetro y área de un rectángulo dada su base y su altura.
 */

public class Ejercicio3a {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner( System.in ); 
        
        double base,
               altura,
               perimetro,
               area; 
        
        System.out.print( "CÁLCULO DEL PERIMETRO Y DEL AREA DE UN RECTANGULO (en cm)");
        System.out.print( " Introduzca la BASE del rectángulo: "); 
        
        base = teclado.nextDouble();
        
        System.out.print( "Introduzca la ALTURA del rectángulo: "); 
        
        altura = teclado.nextDouble(); 
        
        teclado.close(); 
        
        perimetro = 2 * base + 2 * altura;
        area = base * altura; 
        
        System.out.println( "--------RESULTADOS--------"); 
        
        System.out.println( "Perímetro: " + perimetro + " cm"); 
        System.out.println( "Área: " + area + " cm2"); 
        
	}

}
