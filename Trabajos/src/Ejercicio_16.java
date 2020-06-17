import java.util.*;
public class Ejercicio_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor;
		double pagar;
		double tarifaBase;
		double alcantarillado;
		int estrato;
		int mora1, mora2 = 0;
		System.out.println("Digite el numero de personas que va encuestar");
		int usuarios =sc.nextInt();
		for (int i = 0; i < usuarios; i++) {
			System.out.println("Digite su consumo anterior");
			int lanterior =sc.nextInt();
			System.out.println("Digite su consumo actual");
			int lactual =sc.nextInt();
			System.out.println("Digite su estrato");
			estrato = sc.nextInt();
			System.out.println("¿Esta en mora?");
			System.out.println("1= Si o 2= No");
			mora1 =sc.nextInt();
			int consumo = Math.abs(lanterior - lactual);
			if (consumo == 0) {
				valor = consumo * 0;
				if (estrato == 1 && estrato == 2) {
					tarifaBase = 3500;
					alcantarillado = 9000;
					pagar = valor + tarifaBase+ alcantarillado;
				}
				else if (estrato == 3 && estrato == 4) {
					tarifaBase = 5500;
					alcantarillado = 15000;
					pagar = valor + tarifaBase+ alcantarillado;
				}
				else if (estrato == 5 && estrato == 6) {
					tarifaBase = 7000;
					alcantarillado = 25000;
					pagar = valor + tarifaBase+ alcantarillado;
				}
			}
			else if (consumo >= 1 && consumo <=120) {
				valor = consumo * 33.9;
				if (estrato == 1 && estrato == 2) {
					tarifaBase = 3500;
					alcantarillado = 9000;
					pagar = valor + tarifaBase+ alcantarillado;
				}
				else if (estrato == 3 && estrato == 4) {
					tarifaBase = 5500;
					alcantarillado = 15000;
					pagar = valor + tarifaBase+ alcantarillado;
				}
				else if (estrato == 5 && estrato == 6) {
					tarifaBase = 7000;
					alcantarillado = 25000;
					pagar = valor + tarifaBase+ alcantarillado;
				}
			}
			else if (consumo >= 121 && consumo <=200) {
				valor = consumo * 60.45;
				if (estrato == 1 && estrato == 2) {
					tarifaBase = 3500;
					alcantarillado = 9000;
					pagar = valor + tarifaBase+ alcantarillado;
				}
				else if (estrato == 3 && estrato == 4) {
					tarifaBase = 5500;
					alcantarillado = 15000;
					pagar = valor + tarifaBase+ alcantarillado;
				}
				else if (estrato == 5 && estrato == 6) {
					tarifaBase = 7000;
					alcantarillado = 25000;
					pagar = valor + tarifaBase+ alcantarillado;
				}
			}
			else if (consumo >= 201 && consumo <=300) {
				valor = consumo * 85.6;
				if (estrato == 1 && estrato == 2) {
					tarifaBase = 3500;
					alcantarillado = 9000;
					pagar = valor + tarifaBase+ alcantarillado;
				}
				else if (estrato == 3 && estrato == 4) {
					tarifaBase = 5500;
					alcantarillado = 15000;
					pagar = valor + tarifaBase+ alcantarillado;
				}
				else if (estrato == 5 && estrato == 6) {
					tarifaBase = 7000;
					alcantarillado = 25000;
					pagar = valor + tarifaBase+ alcantarillado;
				}
			}
			else if (consumo >=301 && consumo <=550) {
				valor = consumo * 105.2;
				if (estrato == 1 && estrato == 2) {
					tarifaBase = 3500;
					alcantarillado = 9000;
					pagar = valor + tarifaBase+ alcantarillado;
				}
				else if (estrato == 3 && estrato == 4) {
					tarifaBase = 5500;
					alcantarillado = 15000;
					pagar = valor + tarifaBase+ alcantarillado;
				}
				else if (estrato == 5 && estrato == 6) {
					tarifaBase = 7000;
					alcantarillado = 25000;
					pagar = valor + tarifaBase+ alcantarillado;
				}
			}
			else {
				System.out.println("Error del consumo");
			}
			if (mora1 == 1) {
				mora2 +=1;
			}
		}
		System.out.println("Estan es la cantidad de personas estan en mora "+mora2);
/*
 * 4. La Empresa de Acueducto y Alcantarillado de Bogotá, realiza el cobro de las tarifas de
los siguientes usuarios que se encuentran en mora. El valor total de pago depende del
valor del consumo + tarifa base + alcantarillado
Para encontrar el Consumo debe conocer la Lectura Actual y la Lectura Anterior.
consumo = lactual - lanterior
Ejemplo:
Lactual: 4272
Lanterior: 4222
Consumo: 4272 – 4222 = 50
Realice un algoritmo que imprima el valor total de cobro para N usuarios. Y
cuántas personas están en Mora. Para saber quien está en Mora, solo
preguntar si está en Mora.
Tabla 1. Valor por Consumo por Metro Cúbico
CONSUMO M3  -  VALOR M3
0   && 0    -  0
1   && 120  -  33,9
121 && 200  -  60,45
201 && 300  -  85,6
301 && 550  -  105,2

Tabla 2. Tarifa Base
ESTRATO -TARIFA
1 - 2   -$ 3500
3 - 4   -$ 5500
5 - 6   -$ 7000

Tabla 3. Servicio de Alcantarillado
ESTRATO -TARIFA
1 - 2   -$ 9000
3 - 4   -$ 15000
5 - 6   -$ 25000

 */
	}

}
