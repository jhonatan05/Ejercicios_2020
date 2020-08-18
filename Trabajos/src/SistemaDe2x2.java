import java.util.Scanner;

public class SistemaDe2x2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite el numero 'a'");
		double a = sc.nextDouble();
		System.out.println("Digite el numero 'b'");
		double b = sc.nextDouble();
		System.out.println("Digite el numero 'c'");
		double c = sc.nextDouble();
		System.out.println("Digite el numero 'd'");
		double d = sc.nextDouble();
		System.out.println("Digite el numero 'e'");
		double e = sc.nextDouble();
		System.out.println("Digite el numero 'f'");
		double f = sc.nextDouble();
		
		double x = ((e*d)-(b*f))/((a*d)-(b*c));
		double y = ((a*f)-(e*c))/((a*d)-(b*c));
		System.out.println("la x es igual a: "+x);
		System.out.println("la y es igual a: "+y);
	}
/*
 * Resolver un sistema 2x2, dos ecuaciones con dos incógnitas.
 Condiciones de la entrada:
 6 enteros, los primeros dos serán los dos coeficientes de la primera
ecuación, seguidos del término independiente de la primera ecuación
y los otros 3 serán los coeficientes y término independiente de la
segunda ecuación.
 Asumir que la ecuación tiene solución y es única.
 Condiciones de salida:
 La solución del sistema 2x2, es decir, los dos valores.
 */
}
