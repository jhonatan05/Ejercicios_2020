import java.util.Scanner;

public class Ejercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un numero");
		long numero = sc.nextInt();
		System.out.println(suma(numero));
	}
	public static long suma(long n) {
		if (n == 0) {
			return 0; 
		}
		else {
			return suma(n-1)+n;
		}
			
		
	}
/*
 * Dado un numero n, sumar todos los números naturales de 0 a n utilizando
recursividad:
 */
}
