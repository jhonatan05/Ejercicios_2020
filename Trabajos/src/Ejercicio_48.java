import java.util.Scanner;

public class Ejercicio_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite el punto x1");
		double x1 = sc.nextDouble();
		System.out.println("Digite el punto y1");
		double y1 = sc.nextDouble();
		System.out.println("Digite el punto x2");
		double x2 = sc.nextDouble();
		System.out.println("Digite el punto y2");
		double y2 = sc.nextDouble();
		if (x1 == x2) {
			System.out.println("La pendiente es indefinida");
		}
		else {
			double pendiente = (y1 - y2)/(x1 - x2);
			System.out.println("La pendiente de la recta es: "+pendiente);
		}
	}
	/*
	 * Dados dos puntos hallar la pendiente de la recta que forman en el plano cartesiano.
 Condiciones de la entrada: 4 números reales representando dos puntos
(x1,y1) y (x2,y2). Decir si la pendiente es indefinida.
 Condiciones de la salida: La pendiente de la recta que forman los puntos.
	 */

}
