import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite el tama�o del cuadrado");
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
 * Dise�ar e implementar un programa que tome como entrada 5 n�meros enteros
positivos y produzca como salida un patr�n como se muestra en el ejemplo:
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
dimensiones), despu�s resolverlo usando un arreglo de una dimensi�n y
tama�o n.
 */
}