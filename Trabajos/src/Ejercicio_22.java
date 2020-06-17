import java.util.*;
public class Ejercicio_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite el numero de r");
		double r = sc.nextInt();
		System.out.println("Digite el numero de t");
		double t = sc.nextInt();
		if (t >= 1 && t <= 360) {
			String coordenadas=vertice(r, t);
		System.out.println(coordenadas);
		}
		else {
			System.out.println("Esta mal el numero t");
		}
		
	}
	public static String vertice(double num, double num2) {
		double x = num*Math.cos(num2);
		double y = num*Math.sin(num2);
		return ("La coordenada x es: "+x+" y la coordenada y es: "+y);
	}

}
