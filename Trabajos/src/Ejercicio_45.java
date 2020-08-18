import java.util.Scanner;

public class Ejercicio_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite su numero de cedula");
		String cedula = sc.next();
		
			System.out.println("anio "+cedula.charAt(0)+""+cedula.charAt(1));
			System.out.println("mes "+cedula.charAt(2)+""+cedula.charAt(3));
			System.out.println("dia "+cedula.charAt(4)+""+cedula.charAt(5));
	}
/*
 * . Separar datos de tarjeta de identidad.
 Condiciones de la entrada: Un número de tarjeta de identidad colombiana
válido. Es decir, un número de 11 dígitos en donde los primeros dos son el
año, los siguientes dos el mes, los siguientes dos el día y los últimos 5 no
importan para este problema.
 Ejemplos:
 Entrada: 95121054321
 Salida:
 95
 12
 10
 */
}
