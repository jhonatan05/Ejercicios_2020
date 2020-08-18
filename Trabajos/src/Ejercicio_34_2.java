import java.util.Scanner;

public class Ejercicio_34_2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cantidad = 5;
		int numero[]= new int [cantidad];
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Digite un numero");
			numero[i] = sc.nextInt();
		}
		if (numero[0] < numero[1] && numero[0] < numero[2] && numero[0] < numero[3] && numero[0] < numero[4]) {
			System.out.println("El primer numero es el menor");
		}
		else if (numero[1] < numero[0] && numero[1] < numero[2] && numero[1] < numero[3] && numero[1] < numero[4]) {
			System.out.println("El segundo numero es el menor");
		}
		 else if (numero[2] < numero[0] && numero[2] < numero[1] && numero[2] < numero[3] && numero[2] < numero[4]) {
			System.out.println("El tercer numero es el menor");
		}
		 else if (numero[3] < numero[0] && numero[3] < numero[1] && numero[3] < numero[2] && numero[3] < numero[4]) {
			System.out.println("El cuarto numero es el menor");
		}
		 else {
			System.out.println("El quinto numero es el menor");
		}
		
		}
	}


