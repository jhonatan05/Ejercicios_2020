import java.util.Scanner;

public class RombosLETRAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un numero");
		int numero = sc.nextInt();
		char x,y;
		for (int i = 0; i < numero +numero - 1; i++) {
			for(x='Z'; x>='A'; x--){ 

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
						System.out.print(x);

					}
				}
			}
			System.out.println();
		}
	}

}
