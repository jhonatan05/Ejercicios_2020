import java.util.*;
public class Ejercicio_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un numero");
		int numero1 = sc.nextInt();
		System.out.println("Digite otro numero");
		int numero2 = sc.nextInt();
		if (numero1%2 == 0 && numero2%2 ==0) {
			System.out.println("Los dos numeros son pares");
		}
		else if (numero1%2 == 1 && numero2%2 == 1) {
			System.out.println("Los dos numeros son impare");
		}
		else {
			System.out.println("Un numero es par y el otro impar");
		}
	}

}
/*
*Tomar dos números enteros y mostrar uno de los siguientes mensajes según el
caso:
 Ambos números son pares
 Ambos números son impares
 Hay un número par y otro impar
*/