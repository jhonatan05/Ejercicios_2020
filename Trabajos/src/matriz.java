import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite el tamaño del cuadrado");
			int tamanio = in.nextInt();
		int mat[][] = new int [9][5];
				
		
	
	
		for(int i = 0; i < mat.length; i++) {
//			System.out.print(mat[i] );
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println("");
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
 ..#..
 ..##.
 #.##.
 #.###
 #####

 Usar primero una matriz para resolver este problema (arreglo de 2
dimensiones), después resolverlo usando un arreglo de una dimensión y
tamaño n.
 */
}