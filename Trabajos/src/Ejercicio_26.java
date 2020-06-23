import java.util.*;
public class Ejercicio_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int suma= 0;
		System.out.println("Digite la cantidad de veces que quiere digitar un numero");
		int numero = sc.nextInt();
		int numeros2[]= new int[numero];
		for (int i = 0; i < numero; i++) {
			System.out.println("Digite un numero cualquiera ya sea positivo o negativo");
			 numeros2 [i] =sc.nextInt();
			if (numeros2 [i] < 0) {
				suma = suma + 1;
			}
		}
		System.out.println("La cantidad de numeros negativos es de: "+suma);
	}

}
//Escribir un algortimoque verifique cuantos numeros negativos hay en un arreglo de enteros