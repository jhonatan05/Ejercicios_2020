import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un entero");
		int entero = sc.nextInt();
		int cantidad = 5;
		int numeros[] = new int [cantidad];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite un numero");
			numeros[i] = sc.nextInt();
		}
		if (numeros[4]-numeros[3]==entero) {
			if (numeros[3]-numeros[2]==entero) {
				if (numeros[2]-numeros[1]==entero) {
					if (numeros[1]-numeros[0]==entero) {
						System.out.println("si son una progresion aritmetica");
					}
					else {
						System.out.println("No es una progresion aritmetica");
					}
				}
				else {
					System.out.println("No es una progresion aritmetica");
				}
			}
			else {
				System.out.println("No es una progresion aritmetica");
			}
		}
		else {
			System.out.println("No es una progresion aritmetica");
		}
	}
/*
 * Tomar como entrada 5 números enteros y un entero adicional “d” y si los 5 números
son números seguidos de una progresión aritmética con diferencia “d”.

 */
}
