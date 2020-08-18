import java.util.Scanner;

public class Piramide_Extrema {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite un numero");
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < Math.pow(2, n); j++) {
				int cantX = (int) Math.pow(2, i+1);
				if(j < (Math.pow(2, n) - cantX)/2  || j > (Math.pow(2, n) - cantX)/2 + cantX-1) {
					System.out.print(" ");
				}
				else {					
					System.out.print("X");
				}
			}
			System.out.println();
		}

	}

}
/*
 * Lea un número n y muestre en pantalla la siguiente figura dependiendo del valor de
n. Ejemplo, si n es 5: (pensar en utilizar potencias)
                XX
               XXXX
             XXXXXXXX
         XXXXXXXXXXXXXXXX
 XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

 */

