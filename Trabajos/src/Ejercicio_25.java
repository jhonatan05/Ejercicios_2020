import java.util.*;
public class Ejercicio_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite una frase");
		String frase = sc.next();
		System.out.println("Digite el numero de veces que quiere que se repita la frase");
		int repetir = sc.nextInt();
		for (int i = 0; i < repetir; i++) {
			System.out.println(frase);
		}
	}

}
// Escribir un algoritmo que reciba una cadena y recoba un numero N y que imprima la cadena N veces