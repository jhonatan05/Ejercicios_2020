import java.util.*;
public class Ejercicio_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cantidad;
		int clave;
		double valor;
		double impuesto1;
		double impuesto2;
		double impuesto3;
		double TotalImpuesto1 = 0;
		double TotalImpuesto2 = 0;
		double TotalImpuesto3 = 0;
		
		System.out.println("Digite cuantos autos tiene");
		cantidad = sc.nextInt();
		for (int cont = 0; cont < cantidad; cont++) {
			System.out.println("Digite si el vehiculo es clave 1, 2 o 3");
			clave = sc.nextInt();
			System.out.println("Digite el valor del vehiculo");
			valor =sc.nextDouble();
			if (clave == 1) {
				impuesto1 = valor * 0.10;
				System.out.println("El impuesto del vehiculo es de: $"+impuesto1);
				TotalImpuesto1 = TotalImpuesto1 + impuesto1;
			}
			else if (clave == 2) {
				impuesto2 = valor *0.07;
				System.out.println("El impuesto del vehiculo es de: $"+impuesto2);
				TotalImpuesto2 = TotalImpuesto2 + impuesto2;
			}
			else if (clave == 3) {
				impuesto3 = valor * 0.05;
				System.out.println("El impuesto del vehiculo es de: $"+impuesto3);
				TotalImpuesto3 = TotalImpuesto3 + impuesto3;
			}
			else {
				System.out.println("La clave que digito esta mal vuelvalo a intentar");
			}
		
		}
		System.out.println("El impuesto total de los vehiculos de la clave 1 es: $"+ TotalImpuesto1);
		System.out.println("El impuesto total de los vehiculos de la clave 2 es: $"+ TotalImpuesto2);
		System.out.println("El impuesto total de los vehiculos de la clave 3 es: $"+ TotalImpuesto3);
		/*
		 * El gerente de una compa��a automotriz desea determinar el impuesto que va a pagar
por cada uno de los autom�viles que posee, adem�s del total que va a pagar por cada
categor�a y por todos los veh�culos, bas�ndose en la siguiente clasificaci�n:
a. Los veh�culos con clave 1 pagan el 10% de su valor
b. Los veh�culos con clave 2 pagan el 7% de su valor
c. Los veh�culos con clave 3 pagan el 5% de su valor

		 */
	}

}
