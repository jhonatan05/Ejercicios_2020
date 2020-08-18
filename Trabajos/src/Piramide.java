import java.util.Scanner;

public class Piramide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un numero");
		int numero = sc.nextInt();
	
		for (int i = 0; i < numero; i++) {
				
			for (int j = 0; j < numero+numero-1; j++) {
				if (j < numero - i - 1 || j > numero + i - 1) {
					System.out.print(".");
				}
				else {
					System.out.print("x");
				}
				
			}
			System.out.println();
		}
	}

}
