import java.util.Scanner;

public class Ejercicio_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int resultado = Integer.MAX_VALUE;
		System.out.println("�Cuantos numero quiere digitar?");
		int cantidad = sc.nextInt();
		boolean NumerosPositivos = true;
		boolean NumerosNegativos = true;
		boolean NumeroCero = false;
		int num []= new int [cantidad];
		for (int i = 0; i <num.length; i++) {
			System.out.println("Digite un numero");
			num[i] = sc.nextInt();
			if ( num[i]==0) {
				NumeroCero = true;
			}
			else if (num[i] < 0) {
				NumerosPositivos = false;
			}
			else if (num[i] > 0) {
				NumerosNegativos = false;
			}
		}
		if (NumeroCero == true && NumerosPositivos == true && NumerosNegativos== false) {
			System.out.println("Est� el 0 y puros n�meros positivos");
		}
		else if (NumeroCero == true && NumerosPositivos == false && NumerosNegativos== true) {
			System.out.println(" Est� el 0 y puros n�meros negativos");
		}
		else if (NumeroCero == true && NumerosPositivos == true && NumerosNegativos== true) {
			System.out.println("Esta tanto el 0, como numeros positivos y numeros negativos");
		}
		else if (NumeroCero == false && NumerosPositivos == true && NumerosNegativos== true) {
			System.out.println("Todos los numero son positivos");
		}
		else if (NumeroCero == false && NumerosPositivos == false && NumerosNegativos== true) {
			System.out.println("Todos los numero son negativos");
		}
		else {
			System.out.println("Hay tanto numeros positivos como negativos");
		}
	}
}
	


	/*
	 * Tomar como entrada 5 n�meros enteros y mostrar uno de los siguientes mensajes
 seg�n sea el caso:
 Todos los n�meros son negativos
 Todos los n�meros son positivos
 Hay tanto n�meros positivos como negativos
 Est� el 0 y puros n�meros positivos
 Est� el 0 y puros n�meros negativos
 Est� tanto el 0, como n�meros positivos y n�meros negativos
	 */

