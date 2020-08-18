import java.util.Scanner;

public class Ejercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite el primer numero");
		int numero1 = sc.nextInt();
		System.out.println("Digite el segundo numero");
		int numero2 = sc.nextInt();
		System.out.println(mcd(numero1, numero2));
	}
	public static long mcd(long x, long y) {
		if (y == 0) {
			return x ;
		}
		else  {
			return mcd(y, (x%y));
		}
		
	}

}
