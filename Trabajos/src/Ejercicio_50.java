import java.util.Scanner;

public class Ejercicio_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un numero");
		int numero = sc.nextInt();
		boolean resultado = entero(numero);
		System.out.println(resultado);
	}
	public static boolean entero(int num) {
		return num >= 0 && num <= 100;
	}
	/*
	 * Dise�ar y probar con un programa un m�todo en java que retorne true si un n�mero
entero est� en el intervalo [0,100].
	 */
}
