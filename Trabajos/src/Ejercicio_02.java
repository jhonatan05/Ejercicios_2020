import java.util.*;
public class Ejercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double costo;
		double impuesto;
		double ganancia;
		double total;
		double TotalPagar;
		System.out.println("¿Cual es el costo del vehiculo?");
		costo = sc.nextDouble();
		ganancia = costo * 0.20;
		total = costo + ganancia;
		impuesto = total * 0.15;
		TotalPagar = impuesto + total;
		System.out.println("El valor que tiene que pagar el consumidor es de: $" + TotalPagar);
		
		
/*
 * . El costo de un automóvil usado para el consumidor es la suma total del costo del
vehículo, el porcentaje de ganancia del vendedor y los impuestos aplicables (sobre el
precio de venta). Supóngase una ganancia del vendedor del 20% en todas las unidades
y un impuesto del 15% Diseñe un algoritmo para leer el costo del automóvil e imprimir
el costo final para el consumidor.
 */
	}

}
