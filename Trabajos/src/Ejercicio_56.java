import java.util.Scanner;

public class Ejercicio_56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("digite el tamaño del cuadrado");
		int tamanio = sc.nextInt();
		System.out.println("Digite el caracter que quiere ver en el cuadrado");
		String letra = sc.next();
		for (int i = 0; i < tamanio; i++) {
			System.out.print(letra);
		}
		System.out.println();
		for (int i = 0; i < tamanio-2; i++) {
			System.out.print(letra);
			for (int j = 0; j < tamanio-2; j++) {
				System.out.print(" ");
			}
			System.out.println(letra);
		}
		for (int i = 0; i < tamanio; i++) {
			System.out.print(letra);
		}
			}
	}
/*
 * . Lea un número n y un caracter c, y muestre en pantalla la siguiente figura
dependiendo del valor de n. Ejemplo, si n es 5, debe mostrar un cuadrado con de
lado 5, escrito con el caracter ingresado (supongamos que ingresaron A):
AAAAA
A   A
A   A
A   A
AAAAA
 */

