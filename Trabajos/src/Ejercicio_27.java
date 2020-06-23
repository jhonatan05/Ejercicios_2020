import java.util.*;
public class Ejercicio_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int pares = 0;
		System.out.println("Digite cuantas veces quiere digitar un numero"); 
		int num = sc.nextInt();
		int numero[]=new int[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Digite un numero");
			numero[i] = sc.nextInt();
			if (numero[i]%2==0) {
				pares = pares + 1;
			}
		}
		System.out.println("La cantidad de numeros pares es de: "+ pares);
	}

}


