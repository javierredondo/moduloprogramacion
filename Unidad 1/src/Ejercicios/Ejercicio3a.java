package Ejercicios;

import java.util.Scanner;

/* 
 * Calculen el per�metro y �rea de un rect�ngulo dada su base y su altura.
 */

public class Ejercicio3a {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner( System.in ); 
        
        double base,
               altura,
               perimetro,
               area; 
        
        System.out.print( "C�LCULO DEL PERIMETRO Y DEL AREA DE UN RECTANGULO (en cm)");
        System.out.print( " Introduzca la BASE del rect�ngulo: "); 
        
        base = teclado.nextDouble();
        
        System.out.print( "Introduzca la ALTURA del rect�ngulo: "); 
        
        altura = teclado.nextDouble(); 
        
        teclado.close(); 
        
        perimetro = 2 * base + 2 * altura;
        area = base * altura; 
        
        System.out.println( "--------RESULTADOS--------"); 
        
        System.out.println( "Per�metro: " + perimetro + " cm"); 
        System.out.println( "�rea: " + area + " cm2"); 
        
	}

}
