import java.util.Scanner;

public class Ecuacion_Cuadratica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite el numero 'a'");
		double a = sc.nextInt();
		System.out.println("Digite el numero 'b'");
		double b = sc.nextInt();
		System.out.println("Digite el numero 'c'");
		double c = sc.nextInt();
		if (a == 0) {
			System.out.println("La ecuacion no tiene solucion");
		}
		else {
			double interiorRaiz = Math.pow(b, 2) - (2*a*c);
			double raiz = Math.sqrt(interiorRaiz);
			System.out.println(raiz);
			double  x1 = ((-b) - raiz)/(2*a);
			double  x2 = ((-b) + raiz)/(2*a);
			System.out.println("El resultado de x1 es: "+ x1);
			System.out.println("El resultado de x2 es: "+ x2);
		}
	}
	/*
	 * Resolver una ecuaci�n cuadr�tica.
 Condiciones de la entrada: tres valores que ser�n los coeficientes a, b y c de
una ecuaci�n cuadr�tica. Si la ecuaci�n no tiene soluci�n en los reales,
notificarlo al usuario.
 Condiciones de salida: Las dos ra�ces de la ecuaci�n.
 Recomendaci�n: Usar Math.sqrt() para hallar la ra�z cuadrada de un n�mero.
Usar la f�rmula general

	 */
}
