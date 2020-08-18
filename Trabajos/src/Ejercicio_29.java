import java.util.*;
public class Ejercicio_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite un numero de mas de 5 digitos");
		int numero = sc.nextInt();
		int num1 = (numero%10);
		int num2= (numero/10)%10;
		int num3 = (numero/100)%10;
		int num4 = (numero/1000)%10;
		int num5 = (numero/10000)%10;
		System.out.println("Este es su numero alrevez "+num1+""+num2+""+num3+""+num4+""+num5);
	}

}
/*
 * Invertir número de 5 dígitos.
 Condiciones de la entrada: Un número entero positivo de 5 dígitos que no
empieza por 0. Es decir, un número en el intervalo: [10000,99999]
 Condiciones de la salida: El número invertido.
 Ejemplos:
 Entrada: 12345, Salida: 54321
 Entrada: 10000, Salida: 00001
 Entrada: 99999, Salida: 99999
 */
