import java.util.Scanner;

public class mainEcuacionLineal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite el numero 'a'");
		double a = in.nextDouble();
		System.out.println("Digite el numero 'b'");
		double b = in.nextDouble();
		System.out.println("Digite el numero 'c'");
		double c = in.nextDouble();
		System.out.println("Digite el numero 'd'");
		double d = in.nextDouble();
		System.out.println("Digite el numero 'e'");
		double e = in.nextDouble();
		System.out.println("Digite el numero 'f'");
		double f = in.nextDouble();
		EcuacionLineal ecuacion = new EcuacionLineal(a, b, c, d, e, f);
		if (ecuacion.esSolucionable()) {
			System.out.println("La x es igual a: "  + ecuacion.obtenerX());
			System.out.println("La y es igual a: " + ecuacion.obtenerY());
		}
		else {
			System.out.println("La escuacion no tiene solucion");
		}
	}

}
