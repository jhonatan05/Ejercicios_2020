import java.util.*;
public class Ejercicio_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un numero");
		int num1 = sc.nextInt();
		System.out.println("Digite otro numero");
		int num2 = sc.nextInt();
		System.out.println("Digite otro numero");
		int num3 = sc.nextInt();
		int multiplicacion = (num1*num2)*num3;
		int suma = (num1 +num2)+num3;
		if (multiplicacion%2 == 0 && suma%2 == 1) {
			System.out.println("Su multiplicación es par, pero su suma impar.");
		}
		else if (multiplicacion%2 ==1 && suma%2 == 0) {
			System.out.println("Su multiplicacion es impar, pero su suma es par");
		}
		else if (multiplicacion%2 == 0 && suma%2 == 0) {
			System.out.println("Tanto la multiplicacion como su suma son pares");
		}
		else if (multiplicacion%2 == 1 && suma%2 == 1) {
			System.out.println("Tanto la multiplicacion como su suma son impares");
		}
	}
/*
 *  Tomar tres números enteros y mostrar uno de los siguientes mensajes según el
caso:
 Su multiplicación es par, pero su suma impar.
 Su multiplicación es impar, pero su suma par.
 Tanto su multiplicación como su suma son pares.
 Tanto su multiplicación como su suma son impares.
 */
}
