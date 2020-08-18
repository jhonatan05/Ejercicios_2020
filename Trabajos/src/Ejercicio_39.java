import java.util.Scanner;

public class Ejercicio_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cantidad = 5;
		int numeros[] = new int [cantidad];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("digite un numero");
			numeros[i] = sc.nextInt(); 
			
		}
		if (numeros[0] > numeros[1]) {
			if (numeros[1] > numeros[2]) {
				if (numeros[2] > numeros[3]) {
					if (numeros[3] > numeros[4]) {
						System.out.println("Los numeros que digito si son una secuencia estrictamente decriente");
					}
					else {
						System.out.println("Los numeros que digito no son una secuencia estrictamente decriente");
					}
				}
				else {
					System.out.println("Los numeros que digito no son una secuencia estrictamente decriente");
				}
			}
			else {
				System.out.println("Los numeros que digito no son una secuencia estrictamente decriente");
			}
		}
		else {
			System.out.println("Los numeros que digito no son una secuencia estrictamente decriente");
		}
	}
/*
 * Tomar como entrada 5 números enteros y decir si son una secuencia de números
estrictamente decreciente o no.
 */
}
