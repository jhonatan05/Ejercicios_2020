import java.util.Scanner;

public class Rombo_letras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un numero");
		int numero = sc.nextInt();
		char abc = 'A';
		for (int i = 0; i < numero +numero - 1; i++) {
			for (int j = 0; j < numero + numero -1 ; j++){
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
					char x = (char) (abc ++);
					if (x == 90) {
						abc = 'A';
					}
					System.out.print(x);
				}
			}
			System.out.println();
		}

	}
	/*
	 * Lea un número n y muestre en pantalla la siguiente figura dependiendo del valor de
n. Ejemplo, si n es 5:
           a
          bcd
         efghi
        jklmnop
       qrstuvwxy
        zabcdef
         ghijk
          lmn
           o 
	 */

}
