import java.util.*;
public class Ejercicio_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double nota1;
		double nota2;
		double nota3;
		double promedio;
		double credito;
		double descuento;
		double ValorPagar;
		System.out.println("Digite la nota de Calculo");
		nota1 = sc.nextDouble();
		System.out.println("Digite la nota de Fundamentos");
		nota2 = sc.nextDouble();
		System.out.println("Digite la nota de Estadistica");
		nota3 = sc.nextDouble();
		promedio = (nota1+nota2+nota3)/3;
		if (promedio>=4.5 && promedio <= 5.0) {
			credito = 28 * 150000;
			descuento = (credito * 0.25)+credito;
			System.out.println("Su promedio fue de: "+promedio);
			System.out.println("el alumno de pregrado cursara 28 creditos y obtendra un 25% y el valor de su matricula sera: $"+descuento);
		}
		 else if (promedio >= 4.0 && promedio < 4.5) {
			 credito = 25 * 150000;
				descuento = (credito * 0.10)+credito;
				System.out.println("Su promedio fue de: "+promedio);
				System.out.println("el alumno de pregrado cursara 25 creditos y obtendra un 10% y el valor de su matricula sera: $"+descuento);
		}
		 else if (promedio >= 3.5 && promedio < 4.0) {
			 credito = 20 * 150000;
			 System.out.println("Su promedio fue de: "+promedio);
				System.out.println("el alumno de pregrado cursara 25 creditos  y el valor de su matricula sera: $"+credito);
		}
		 else if ( promedio < 3.5) {
			 credito = 15 * 150000;
			 System.out.println("Su promedio fue de: "+promedio);
				System.out.println("el alumno de pregrado cursara 15 creditos  y el valor de su matricula sera: $"+credito);
		}
		 else {
			System.out.println("Alguna nota que registro debe estar mal, vuelvalo a intentar");
		}
/*
 * Cierta universidad tiene un programa para estimular a los estudiantes con buen
rendimiento acad�mico seg�n las notas en tres asignaturas (Calculo, Fundamentos y
Estad�stica).
             a. Si el promedio de las tres asignaturas es de 4.5 o m�s y el alumno es de pregrado
             (PRE) entonces cursar� 28 cr�ditos y se le har� un 25% de descuento.
             b. Si el promedio es mayor o igual a 4.0 pero menor que 4.5, y el alumno es de
             pregrado, entonces cursar� 25 cr�ditos y se le har� un 10% de descuento.
             c. Si el promedio es mayor o igual que 3.5 y menor que 4.0 y es de pregrado,
             cursar� 20 cr�ditos y no tendr� ning�n descuento.
             d. Si el promedio es menor que 3.5 y es de pregrado, cursar� 15 cr�ditos y no
             tendr� descuento.
Realizar un algoritmo, que escriba por pantalla el valor que debe pagar cada estudiante
y la cantidad de cr�ditos que registra si el valor de cada cr�dito es de $150000 para
pregrado.

 */
	}

}
