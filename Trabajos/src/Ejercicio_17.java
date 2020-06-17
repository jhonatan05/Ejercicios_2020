import java.util.*;
public class Ejercicio_17 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite tres numero para sacar la media");
		System.out.println("Digite el primer numero");
		int numero1 = sc.nextInt();
		System.out.println("Digite el segundo numero");
		int numero2 = sc.nextInt();
		System.out.println("Digite el tercer numero");
		int numero3 = sc.nextInt();
		
		System.out.println("La media de los tres numeros es: "+media(numero1,numero2,numero3));
	}
	public static int media(int numero1, int numero2, int numero3) {
	
		
		int media = (numero1 + numero2 + numero3) / 3 ;
		return   media; 
	}
	//Diseñar una funcion que calcule la media de tres numeros leidos por el teclado
}
