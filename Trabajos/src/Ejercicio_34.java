import java.util.Scanner;

public class Ejercicio_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite el primer numero");
		int num1 = sc.nextInt();
		System.out.println("Digite el segundo numero");
		int num2 = sc.nextInt();
		System.out.println("Digite el tercer numero");
		int num3 = sc.nextInt();
		System.out.println("Digite el cuarto numero");
		int num4 = sc.nextInt();
		System.out.println("Digiteel quinto numero");
		int num5 = sc.nextInt();
		if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5) {
			System.out.println("El primer numero es el menor");
		}
		else if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5) {
			System.out.println("El segundo numero es el menor");
		}
		 else if (num3 < num2 && num3 < num1 && num3 < num4 && num3 < num5) {
			System.out.println("El tercer numero es el menor");
		}
		 else if (num4 < num2 && num4 < num3 && num4 < num1 && num4 < num5) {
			System.out.println("El cuarto numero es el menor");
		}
		 else {
			System.out.println("El quinto numero es el menor");
		}
		}
	}
	/*
	 *  Tomar como entrada 5 números enteros y mostrar el menor de los 5.
	 */

