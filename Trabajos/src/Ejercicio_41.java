import java.util.Scanner;

public class Ejercicio_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cantidad = 5;
		int multiplo = 4;
		int multiplos = 0;
		int numero[] = new int [cantidad];
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digite un numero");
			numero[i] = sc.nextInt();
			if (numero[i] % multiplo == 0) {
				multiplos += 1;
			}
			else {
				System.out.println("El numero "+ numero[i]+ " no es multiplo de 4 ");
			}
		}
		System.out.println("hay "+ multiplos + " numeros que si son multiplos de 4");
	
	}
/*
 * Tomar como entrada 5 números enteros y decir cuántos son múltiplos de 4.
 */
}
