import java.util.*;
public class Ejercicio_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double venta;
		double comision;
		System.out.println("Digite cuanto a vendido");
		venta = sc.nextDouble();
		if (venta >= 5000000) {
			comision = venta*0.015;
			System.out.println("su comision es de: $"+comision);
		}
			else if (venta < 5000000) {
				comision = venta*0.01;
				System.out.println("su comision es de: $"+comision);
			}
			else {
				System.out.println("valor invalido");
			}
		
		/*
		 * Programa que calcula la comisión que le corresponde a un vendedor. Si vendió más de
$5000000, la comisión es el 1.5% sobre las ventas. SI vendió $5000000 o menos, la
comisión es del 1% de las ventas.
		 */


	}

}
