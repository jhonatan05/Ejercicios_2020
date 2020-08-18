import java.util.Scanner;

public class Ejercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un numero");
		int numero = sc.nextInt();
		System.out.println(hanoi(numero));
	}
	public static long hanoi( long n) {
		if (n == 1) {
			return 1;
		}
		else {
			return 2*hanoi(n-1)+1;
		}
	}

}
