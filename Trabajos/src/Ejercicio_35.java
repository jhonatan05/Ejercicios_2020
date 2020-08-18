import java.util.Scanner;

public class Ejercicio_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite el primer numero");
		int numero1 = sc.nextInt();
		System.out.println("Digite el segundo numero");
		int numero2 = sc.nextInt();
		System.out.println("Digite el tercer numero");
		int numero3 = sc.nextInt();
		System.out.println("Digite el cuarto numero");
		int numero4 = sc.nextInt();
		System.out.println("Digite el quinto numero");
		int numero5 =sc.nextInt();
		if (numero1 > numero2 && numero1 > numero3 && numero1 > numero4 && numero1 > numero5) {
			System.out.println("El primer numero es el mayor ");
		}
		else if (numero2 > numero1 && numero2 > numero3 && numero2 > numero4 && numero2 > numero5) {
			System.out.println("El segundo numero es el mayor");
		}
		else if (numero3 > numero2 && numero3 > numero1 && numero3 > numero4 && numero3 > numero5) {
			System.out.println("El tercer numero es el  mayor");
		}
		else if (numero4 > numero2 && numero4 > numero3 && numero4 > numero1 && numero4 > numero5) {
			System.out.println("El cuarto numero es el mayor");
		}
		else {
			System.out.println("El quinto numero es el mayor");
		}
	}
/*
 * Tomar como entrada 5 números enteros y mostrar el Mayor de los 5.
 */
}
