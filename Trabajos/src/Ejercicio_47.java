import java.util.Scanner;

public class Ejercicio_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un numero");
		int pares= sc.nextInt();
		boolean resultadoPar = numeroPar(pares);
		if (resultadoPar == true) {
			System.out.println("El numero es par");
		}
		else {
			System.out.println("El numero es impar");
		}
	}
	
	public static boolean numeroPar (int par) {
		return par%2 == 0;
	}
	/*
	 * Dise�ar y probar con un programa un m�todo en java que retorne true si un n�mero
es par y false en otro caso. Recomendaci�n usar divisi�n parte entera y tomar el
residuo en 2.
	 */
}
