import java.util.*;
public class Ejercicio_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un numero");
		int numero1 = sc.nextInt();
		System.out.println("Digite otro numero");
		int numero2 = sc.nextInt();
		diferencia(numero1, numero2);
	}
	public static  void  diferencia(int num1, int num2) {
		
		if (num1>num2) {
			System.out.println("El primer numero es mayor al segundo numero");
		}
		else {
			System.out.println("El segundo numero es mayor al primer numero");
		}
	}
	//Diseñar una funcion que encuentre el mayor de dos numeros enteros 
}
