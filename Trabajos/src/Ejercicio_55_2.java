import java.util.Scanner;

public class Ejercicio_55_2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i == 0 || i == n-1 || j == 0 || j == n-1) {
					System.out.print("x");
				}
				else {
					System.out.print(" ");					
				}
			}
			System.out.println();
		}

	}

}
