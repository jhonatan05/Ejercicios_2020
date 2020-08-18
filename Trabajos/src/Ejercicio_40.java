import java.util.Scanner;

public class Ejercicio_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cantidad = 5;
		int multiplo = 4;
		boolean multiplos = false;
		int numero[] = new int [cantidad];
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digite un numero");
			numero[i] = sc.nextInt();
			if (numero[i] % multiplo == 0) {
				multiplos = true;
			}
			else {
				multiplos = false;
				break;
			}
		}
		if (multiplos == true) {
			System.out.println("Todos los numeros son multiplos de 4");
		}
		else {
			System.out.println("No todos son multiplos de 4 ");
		}

	}
	/*
	 * Tomar como entrada 5 números enteros y decir si todos son múltiplos de 4.
	 */
}
