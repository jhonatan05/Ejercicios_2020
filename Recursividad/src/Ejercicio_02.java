import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated m
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite el primer numero");
		int n1 = sc.nextInt();
		System.out.println("Digite el segundo numero");
		int n2 = sc.nextInt();
		System.out.println(ackerman(n1, n2));
	}
	public static long ackerman(long m, long n) {
		if (m == 0) {
			return n + 1;
		}
		else if (m > 0 && n==0) {
			return ackerman(m-1, 1);
		}
		else {
			return ackerman(m-1, ackerman(m, n-1));
		}		
	}
	
/*
 * Realizar con métodos recursivos la función de Ackerman:
 */
}
