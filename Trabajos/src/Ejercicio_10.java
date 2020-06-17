import java.util.*;
public class Ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    String nombre;
	    double pago = 35000;
	    double bono = 100000;
	    int CantidadAutos;
	    double comision;
	    double impuesto;
	    double sueldo;
	    System.out.println("Digite su nombre");
	    nombre = sc.next();
	    System.out.println("Digite la cantidad de autos que vendio");
	    CantidadAutos =sc.nextInt();
	   comision = pago * 0.15;
	   comision = comision * CantidadAutos;
	   bono = bono * CantidadAutos;
	   impuesto = (bono+comision+pago)*0.25;
	   sueldo = (bono+comision+pago)-impuesto;
	   System.out.println("El vendedor " + nombre + " su sueldo fue de: $" + sueldo + " y pago de impuesto: $"+ impuesto);
/*
 * . Calcule e imprima el pago mensual para un vendedor de autos, basándose en lo
siguiente:
a. El pago base es de $35000, más una comisión de 15% por cada auto vendido y
un bono de $100000.
b. El impuesto a pagar es el 25% del pago total.
c. Los datos de entrada son el nombre del vendedor, el número de autos vendidos
en el mes y el bono.
d. Se desea imprimir el nombre del vendedor, el sueldo el pago total y el impuesto.
		
 */
		
	}

}
