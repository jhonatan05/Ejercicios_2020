import java.util.Scanner;

public class Ejercicio_42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un multiplo");
		int multiplo = sc.nextInt();
		int cantidad =5 ;
		int multiplos = 0;
		int numero[] = new int [cantidad];
		for (int i = 0; i < numero.length; i++) {
			System.out.println("Digite un numero");
			numero[i] = sc.nextInt();
			if (numero[i] % multiplo == 0) {
				multiplos += 1;
			}
			else {
				System.out.println("El numero "+ numero[i]+ " no es multiplo de  "+multiplo);
			}
		}
		System.out.println("hay "+ multiplos + " numeros que si son multiplos de "+multiplo);
	}
	/*
	 * Tomar como entrada 5 n�meros enteros y un entero adicional �n� y decir cu�ntos de
esos primeros 5 n�meros enteros son m�ltiplos de el n�mero le�do �n�.
	 */
}
