import java.util.*;
public class Ejercicio_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("ingrese un numero");
int num2 = sc.nextInt();
System.out.println("El factorial de: "+ num2 + " es "+ factorial(num2));

	}
	public static double factorial(int num2) {
		double num1 = 1;
		for(int i = 2 ; i <= num2 ; i++) {
			num1 *=i;
		}
		return num1;
	}
// Diseñar un FACTORIAL que calcule el factorial de un numero entero en el rango 100 a 10.000	
}
