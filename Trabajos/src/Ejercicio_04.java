import java.util.*;
public class Ejercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double pesos;
		double yen;
		double francos;
		double dolares;
		int convertir;
		System.out.println("¿Que desea convertir?");
		System.out.println("1= Yen");
		System.out.println("2= Franco suizo");
		System.out.println("3= Dolares");
		convertir = sc.nextInt();
		if (convertir==1) {
			System.out.println("¿Cuantos Pesos quiere convertir a Yens");
			pesos =sc.nextDouble();
			yen = pesos * 0.029;
			System.out.println("Estos pesos $"+ pesos+ " en Yens son: $"+ yen);
		}
		 else if (convertir==2) {
			System.out.println("¿Cuantos pesos quiere convertir a Francos suizo");
			pesos = sc.nextDouble();
			francos = pesos * 0.00026;
			System.out.println("Estos pesos $"+ pesos+ " en Francos suizo son: $"+ francos);
		}
		 else if (convertir == 3) {
			System.out.println("¿Cuantos pesos quiere convertir a Dolares?");
			pesos = sc.nextDouble();
			dolares = pesos*0.00027;
			System.out.println("Estos pesos $"+ pesos+ " en Yens son: $"+ dolares);
		}
		 else {
			System.out.println("Opcion invalida");
		}
		/*
		 * Dada una cantidad en pesos, obtener la equivalencia en Yen, Francos, dólares,
asumiendo que la unidad cambiaria es un dato desconocido.
		 */
	}

}
