import java.util.Scanner;

public class mainEcuacionCuadratica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite el numero 'a'");
		double a = in.nextDouble();
		System.out.println("Digite el numero 'b'");
		double b = in.nextDouble();
		System.out.println("Digite el numero 'c'");
		double c = in.nextDouble();
		EcuacionCuadratica ecuacion = new EcuacionCuadratica(a, b, c);
		double x1 = ecuacion.obtenerRaiz1();
		double x2 = ecuacion.obtenerRaiz2();
		System.out.println("El resultado de x1 es: "+ x1);
		System.out.println("El resultado es x2 es: "+ x2);
	}

}
