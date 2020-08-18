import java.util.*;
public class Ejercicio_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		int n = 5;
		for (int i = 0; i < n; i++) {
			System.out.println("Digite un numero");
			int numero = sc.nextInt();
			suma = suma + numero;
		}
		double promedio = suma / n;
		System.out.println("El promedio aritmetico de "+suma+" es: "+promedio);
	}
/*
 * Tomar como entrada 5 números enteros y mostrar el promedio aritmético de los 5.
Nota: Tener cuidado con hacer bien la división.
 */
}
