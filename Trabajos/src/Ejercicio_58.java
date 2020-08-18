import java.util.Scanner;

public class Ejercicio_58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un numero");
		int numero = sc.nextInt();
		for (int i = 0; i < numero +numero - 1; i++) {
			for (int j = 0; j < numero + numero -1 ; j++) {
				if ( i < numero && j < numero - i - 1) {
					System.out.print(".");
				}
				else if (i < numero && j > numero + i - 1) {
					System.out.print(".");
				}
				else if (i >= numero && j < i - numero + 1) {
					System.out.print(".");
				}
				else if (i >= numero && j > (numero+(numero-1-(i-numero+2)))) {
					System.out.print(".");
				}
				else {
					System.out.print("X");
				}
			}
			System.out.println();
		}
		
	}

}
