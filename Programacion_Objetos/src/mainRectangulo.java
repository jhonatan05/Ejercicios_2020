import java.util.Scanner;

public class mainRectangulo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite el alto del rectangulo");
		double alto = in.nextDouble();
		System.out.println("Digite el ancho del rectangulo");
		double ancho = in.nextDouble();
		
		Rectangulo sc = new Rectangulo(alto, ancho);
		double area = sc.obtenerArea();
		double perimetro = sc.obtenerPerimetro();
		
		System.out.println("El area del rectangulo es: "+area);
		System.out.println("El perimetro del rectangulo es: "+perimetro);
		
		
		System.out.println();
		
		
		Rectangulo sc2 = new Rectangulo();
		
		area = sc2.obtenerArea();
		perimetro = sc2.obtenerPerimetro();
		
		System.out.println("El area del rectangulo es: "+area);
		System.out.println("El perimetro del rectangulo es: "+perimetro);
	}

}
