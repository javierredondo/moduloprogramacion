package Ejercicios;

import java.util.Scanner;

/*
 * Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.
 */

public class Ejercicio3e {

	public static void main(String[] args) {

		Scanner teclado = new Scanner( System.in );
        
        int cateto1, cateto2; 
        double hipotenusa; 
                        
        System.out.print( "Introduzca el Primer Cateto: "); 
        
        cateto1 = teclado.nextInt(); 
        
        System.out.print( "Introduzca el Segundo Cateto: "); 
        
        cateto2 = teclado.nextInt(); 
        
        teclado.close(); 
        
        hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2); 
        
        System.out.println( "--------RESULTADOS--------"); 
        
        System.out.println( "Hipotenusa: " + hipotenusa ); 
		
	}

}
