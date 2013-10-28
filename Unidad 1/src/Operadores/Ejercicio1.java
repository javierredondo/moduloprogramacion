package Operadores;

/* Realizar las expresiones aritméticas propuestas en clase. Intentar analizar el resultado en Java. Después comprobar ejecutándolas, que es el resultado que realmente Java nos ofrece.
1) ( -5 ** 2 + 10 ) * 3
2) 35.3 - 53 / 10 
3) 1 + 5 % 1.5 * 8 / 2
4) ( (-2) ** 5 + 18 / 5 )
5) 65 / 3 / 4.0 * 3
6) 44 % 10 + 7 - 25 ** 10 -2 
7) 4.0 / 10.0 + 3.5 * 2
8) 10 % 4 + 6 / 2
9) abs(4-20/3) ** 3
10) sqrt(4.5 - 5.0) + 7 * 3
11) 3 * 10 / 3 + 10 % 3
12) 3L ** 3
13) ((36.0 / 4) + (5 * 3))
14) ((28 / 7) * 2)
15) (13 * 3) % 10
16) 2**(3**3)        
*/

public class Ejercicio1 {

	public static void main(String[] args) {
		
		double resultado = 0;
        
        resultado=(Math.pow(-5, 2)+10)*3;
        System.out.println("1) (-5)^2+10) * 3 = " + resultado);
        
        resultado= 35.3 - 53 / 10;
        System.out.println("2) 35.3 - 53 / 10 = " + resultado);
        
        resultado= 1 + 5 % 1.5 * 8 / 2;
        System.out.println("3) 1 + 5 % 1.5 * 8 / 2 = " + resultado);
        
        resultado= -(Math.pow(-2, 5) + 18 / 5);
        System.out.println("4) -(-2^5 + 18 / 5) = " + resultado);
        
        resultado= 65 / 3 / 4.0 * 3;
        System.out.println("5) 65 / 3 / 4.0 * 3 = " + resultado);
        
        resultado= 44 % 10 + 7 - Math.pow(25, 10) -2;
        System.out.println("6) 44 % 10 + 7 - 25^10 - 2 = " + resultado);
        
        resultado= 4.0 / 10.0 + 3.5 * 2;
        System.out.println("7) 4.0 /10.0 + 3.5 * 2 = " + resultado);
        
        resultado= 10 % 4 + 6 / 2;
        System.out.println("8) 10 % 4 + 6 / 2 = " + resultado);
        
        resultado= Math.pow(Math.abs(4-20/3), 3);
        System.out.println("9) de (|4 - 20 / 3|)^3 = " + resultado);
        
        resultado= Math.sqrt(4.5-5.0)+7*3;
        System.out.println("10) Sqrt(4.5 - 5.0) + 7 * 3 = " + resultado);
        
        resultado= 3 * 10 / 3 + 10 % 3;
        System.out.println("11) 3 * 10 / 3 + 10 % 3 = " + resultado);
        
        resultado= Math.pow(3L, 3);
        System.out.println("12) 3L^3 = " + resultado);
        
        resultado= (36.0 / 4)+(5 * 3);
        System.out.println("13) (36.0/4)+(5*3) = " + resultado);
        
        resultado= (28 / 7)*2;
        System.out.println("14) (28 / 7)*2 = " + resultado);
        
        resultado= (13 * 3) % 10;
        System.out.println("15) (13*3)%10 = " + resultado);
        
        resultado=  Math.pow(Math.pow(2, 3), 3);
        System.out.println("16) 2^3^3 = " + resultado);		 
	}

}
