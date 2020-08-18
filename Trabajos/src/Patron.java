import java.util.Scanner;

public class Patron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite el alto de la matriz");
		int n = 9;//cambiar esto
		System.out.println("Digte el ancho de la matriz");
		int m = 5;
		int mat[][] = new int[n][m];
		int matt[] = new int [m];
		int mayor = 0;
		for (int i = 0; i < matt.length; i++) {
			System.out.println("Digite un numero");
			matt[i] = sc.nextInt();
			if (mayor <  matt[i]) {
				mayor = matt[i];
			}	
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (mayor - matt[j] < i+1) {

					System.out.print("#");
				}
				else {
					System.out.print(".");
				}
			}
			System.out.println("");
		}
	}
}
/*
 * Diseñar e implementar un programa que tome como entrada 5 números enteros
positivos y produzca como salida un patrón como se muestra en el ejemplo:
 Entrada:
3 1 8 4 2
 Salida:
 ..#..
 ..#..
 ..#..
 ..#..
 ..##.
 #.##.
 #.###
 #####

 Usar primero una matriz para resolver este problema (arreglo de 2
dimensiones), después resolverlo usando un arreglo de una dimensión y
tamaño n.
 */



