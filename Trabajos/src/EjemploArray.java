
import java.util.Scanner;

public class EjemploArray {

	public static void main(String[] args) {
		int numeros[] = {13242, 2123, 36787676, 1234};
		
		System.out.println(numeros[2]);
		System.out.println("tamaño del arreglo: " + numeros.length);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
	}
//		Scanner in = new Scanner(System.in);
//		int numeros[] = new int[4];
//		for (int i = 0; i < numeros.length; i++) {
//			numeros[i] = in.nextInt();
//		}
//		for (int i = 0; i < numeros.length; i++) {
//			System.out.println(numeros[i] + 1);
//		}
//		System.out.println(Arrays.toString(numeros));

	}

}
