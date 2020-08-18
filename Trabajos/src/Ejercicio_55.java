import java.util.Scanner;

public class Ejercicio_55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("digite el tamaño del cuadrado");
		int tamanio = sc.nextInt();
		for (int i = 0; i < tamanio; i++) {
			System.out.print("x");
		}
		System.out.println();
		for (int i = 0; i < tamanio-2; i++) {
			System.out.print("x");
			for (int j = 0; j < tamanio-2; j++) {
				System.out.print(" ");
			}
			System.out.println("x");
		}
		for (int i = 0; i < tamanio; i++) {
			System.out.print("x");
		}
	}


	/*
	 * Lea un número n y muestre en pantalla la siguiente figura dependiendo del valor de
n. Ejemplo, si n es 5, debe mostrar un cuadrado con de lado 5, escrito con x:
xxxxx
x   x
x   x
x   x
xxxxx

	 */
}
