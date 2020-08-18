import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un numero");
		int numero = sc.nextInt();
		System.out.println(factorial(numero));
	}

	public static long factorial(long numero) {
		if(numero==1) { //caso base
			return 1;
		}
		else { //caso recursiva
			return numero * factorial(numero-1);
		}
	}

}
