import java.util.*;
public class Ejercicio_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un numero negativo");
		int numero = sc.nextInt();
		valorAbsoluto(numero);
	}
	public static void valorAbsoluto(int numero1) {
		int numero2 = Math.abs(numero1);
		System.out.println("El valor absoluto del numero "+ numero1 + " es " + numero2);
	}
}
