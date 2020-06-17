import java.util.*;
public class Ejercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int retirar;
int pregunta;
int saldo = 100000;
System.out.println("Que desea hacer?");
System.out.println("1= retirar o 2= ver saldo");
pregunta = sc.nextInt();
if (pregunta == 1) {
	System.out.println("¿Cuanto dinero desea retirar?");
	retirar = sc.nextInt();
	System.out.println(saldo -retirar );
	
	}
	else if (pregunta == 2) {
		System.out.println("Su saldo es: $"+ saldo);
		
		}
	else {
		System.out.println("Opcion invalida, vuelvalo a intentarlo");
	}

/*
 * Un banco quiere diseñar un algoritmo para manejar sus cajeros automáticos.
a. Dicho programa sólo debe permitir retirar dinero y consultar el saldo de una
cuenta.
b. Identifique y discuta los aspectos que constituyen el problema. Si el enunciado
no es explícito con respecto a algún punto, intente imaginar la manera de
completarlo

 */
	}

}
