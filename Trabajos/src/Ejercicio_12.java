import java.util.*;
public class Ejercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero1, numero2, numero3;
		System.out.println("Ingrese el primer numero");
		numero1 =sc.nextInt();
		System.out.println("Ingrese el segundo numero");
		numero2= sc.nextInt();
		System.out.println("Ingrese el tercer numero");
		numero3 = sc.nextInt();
		if (numero1 == numero2 + numero3) {
			System.out.println("El segundo numero y el tercero numero es la suma del primer numero");
		}
		else if (numero2 == numero1 + numero3) {
			System.out.println("El primer numero y el tercer numero es la suma del segundo numero");	
		}
		else if (numero3 == numero1 + numero2) {
			System.out.println("El primer numero y el segundo numero es la suma del tercer numero");
		}
		else {
			System.out.println("Gracias");
		}
		
		
		
		/*Realice un algoritmo que permita ingresar tres números y diga si uno de los es la suma
de los otros dos.
*/

	}

}
