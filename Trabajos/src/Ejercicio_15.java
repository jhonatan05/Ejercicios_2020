import java.util.*;
public class Ejercicio_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int trabajadores;
		double salario;
		double porcentaje;
		double prestamo;
		double prestamoTotal = 0;
		double porcentajeTotal = 0;
		System.out.println("¿Cuantos trabajadores tiene?");
		trabajadores = sc.nextInt();
		for(int i = 1; i <= trabajadores; i++) {
			System.out.println("Digite el salario del trabajador "+i);
			salario = sc.nextDouble();
			if (salario >= 1000000 && salario < 2000000) {
				porcentaje = 0.40;
				prestamo = salario * porcentaje;
				System.out.println("El prestamo que se le hizo al trabajador "+ i+" es de: $"+prestamo);
				prestamoTotal = prestamoTotal + prestamo;
				porcentajeTotal = porcentajeTotal + porcentaje;
			}
			else if (salario >= 2000000 && salario < 3000000) {
				porcentaje = 0.50;
				prestamo = salario * porcentaje;
				System.out.println("El prestamo que se le hizo al trabajador "+ i+" es de: $"+prestamo);
				prestamoTotal = prestamoTotal + prestamo;
				porcentajeTotal = porcentajeTotal + porcentaje;
			}
			else if (salario >= 3000000 && salario < 5000000) {
				porcentaje = 0.60;
				prestamo = salario * porcentaje;
				System.out.println("El prestamo que se le hizo al trabajador "+ i+" es de: $"+prestamo);
				prestamoTotal = prestamoTotal + prestamo;
				porcentajeTotal = porcentajeTotal + porcentaje;
			}
			else if (salario > 5000000 ) {
				porcentaje = 0.70;
				prestamo = salario * porcentaje;
				System.out.println("El prestamo que se le hizo al trabajador "+ i+" es de: $"+prestamo);
				prestamoTotal = prestamoTotal + prestamo;
				porcentajeTotal = porcentajeTotal + porcentaje;
			}
			else if (salario >= 877.802 && salario < 1000000) {
				porcentaje = 0.30;
				prestamo = salario * porcentaje;
				System.out.println("El prestamo que se le hizo al trabajador "+ i+" es de: $"+prestamo);
				prestamoTotal = prestamoTotal + prestamo;
				porcentajeTotal = porcentajeTotal + porcentaje;
			}
			System.out.println();
			System.out.println("La cantidad de dinero prestado fue de: $"+prestamoTotal);
			System.out.println("El total de pocentaje fue de: "+porcentajeTotal);
		}
		
		
		
		/*
		 * Diseñe un algoritmo que, dado el salario de N trabajadores, calcule el porcentaje del
monto del préstamo que se le otorgara de acuerdo con la siguiente información: Si
gana entre 1.000.000 y 2.000.000 se le presta el 40% del valor de su salario. Si gana
más de 2.000.000 y menos o igual a 3.000.000 se le presta el 50% del valor de su
salario. Si gana más de 3.000.000 y menos de 5.000.000 se le prestara el 60% del valor
de su salario. Si gana más de 5.000.000 se le presta el 70% del valor de su salario. Si
gana menos de 1.000.000 pero más de un salario mínimo legal vigente solo se le presta
el 30% del valor de su salario. El algoritmo debe mostrar la cantidad de dinero que se
presta y el total de porcentaje.
		 */
	}

}
