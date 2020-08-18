import java.util.*;

public class Ejercicio_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite cuantos numeros quiere tomar de entrada ");
		int  cantidad = sc.nextInt();
		double sumatorio = 0;
		int numeros[]= new int[cantidad];
		double promedio = 0;
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Digite un numero");
			numeros[i] = sc.nextInt();
			promedio = promedio + numeros[i];
		}
		promedio = promedio /cantidad;
		for (int i = 0; i < cantidad; i++) {
			double sumatorio2 = Math.pow(numeros[i]-promedio, 2);
			sumatorio +=  sumatorio2;
		}
		double total1 =   (sumatorio/(cantidad-1));
		double total = Math.sqrt(total1);
		System.out.println(total);
	}
	/*
	 * Tomar como entrada 5 números enteros y mostrar la desviación estándar de los 5.
	 */
}
