import java.util.Scanner;

public class Ejercicio_57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero1 ,numero2;
		boolean numeroCorrecto = false;
		do {
			System.out.println("Ingrese cantidad de filas (numero impar)");
			numero1 = sc.nextInt();
			System.out.println("Ingrese cantidad de columnas (numero impar)");
			numero2 = sc.nextInt();
			if (numero1%2 != 0 && numero2%2 !=0) {
				numeroCorrecto = true;
			}
			else {
				System.out.println("Error ingreso un numero par y deben seer dos impares, vuelva a intentarlo");
			}
			System.out.println();
			
		} while (!numeroCorrecto);
		char matriz [] [] = new char [numero1][numero2];
		int mitad = matriz[0].length/2;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				if ((i+j) >= mitad && (j-i) <= mitad) {
					matriz [i][j] = 'x';
				}
				else {
					matriz [i][j] = ' ';
				}
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
/*
 * Lea un número n y muestre en pantalla la siguiente figura dependiendo del valor de
n. Ejemplo, si n es 5:
     X
    XXX
   XXXXX
  XXXXXXX
 XXXXXXXXX

 */
}
