import java.util.*;
public class Ejercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double sueldo;
		double aumento1;
		double aumento2;
		double aumento3;
		System.out.println("Digite el sueldo de los empleados");
		sueldo = sc.nextDouble();
		aumento1 = (sueldo*0.10)+sueldo;
		System.out.println("Este es el aumento con el 10% $"+aumento1);
		aumento2 = (sueldo*0.12)+sueldo;
		System.out.println("Este es el aumento con el 12% $"+aumento2);
		aumento3 = (sueldo*0.15)+sueldo;
		System.out.println("Este es el aumento con el 15% $"+ aumento3);
/*
 * Leer el sueldo de tres empleados y aplicarles un aumento del 10%, 12% y 15%
respectivamente. Desplegar el resultado.
 */
	}

}
