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
	 * Resolver una ecuación cuadrática.
 Condiciones de la entrada: tres valores que serán los coeficientes a, b y c de
una ecuación cuadrática. Si la ecuación no tiene solución en los reales,
notificarlo al usuario.
 Condiciones de salida: Las dos raíces de la ecuación.
 Recomendación: Usar Math.sqrt() para hallar la raíz cuadrada de un número.
Usar la fórmula general

	 */
}
