import java.util.Scanner;

public class Ejercicio_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos numero dese digitar?");
		int cantidad = sc.nextInt();
		int menor = Integer.MAX_VALUE;
		int mayor = Integer.MIN_VALUE;
		for(int i = 0; i < cantidad; i++) {
			System.out.println("Digite un numero");
			int num = sc.nextInt();
			if(num < menor) {
				menor = num;
			}
			else if (num > mayor) {
				mayor = num;
			}
		}
		System.out.println("Este es el numero menor de los numeros que digito: " + menor);
		System.out.println("Este es el numero mayor de los numeros que digito: " + mayor);
	}
/*
 * Tomar como entrada 5 números enteros y mostrar el menor y el mayor de los 5.
 */
}
