import java.util.Scanner;

public class Ejercicio_51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un numero");
		int numero = sc.nextInt();
		int multiplos = 100;
		boolean resultado = multi(numero, multiplos);
		System.out.println(resultado);
	}
	public static boolean multi(int num, int multiplos) {
		return num % multiplos == 0;
	}
	/*
	 * Dise�ar y probar con un programa un m�todo en java que retorne true si un n�mero
es un m�ltiplo de 100.
	 */
}
