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
		 * Programa que calcula la comisi�n que le corresponde a un vendedor. Si vendi� m�s de
$5000000, la comisi�n es el 1.5% sobre las ventas. SI vendi� $5000000 o menos, la
comisi�n es del 1% de las ventas.
		 */


	}

}
