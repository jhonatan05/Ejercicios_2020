import java.util.*;
public class Ejercicio_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int edad;
		int titulo;
		int trabajo;
		
		System.out.println("Digite su edad");
		edad =sc.nextInt();
		if (edad>= 20 && edad <=50) {
			System.out.println("�Usted tiene un titulo?");
			System.out.println("1= SI o 2= NO");
			titulo = sc.nextInt();
			System.out.println("�Usted trabaja?");
			System.out.println("1= SI o 2= NO");
			trabajo =sc.nextInt();
			if (titulo == 1 && trabajo == 1) {
				System.out.println("Usted es un adulto profesional");
			}
			else if (titulo == 2 && trabajo ==2) {
				System.out.println("Usted es un desempleado");
			}
			else {
				System.out.println("ERROR");
			}
		}
		else if (edad >= 15 && edad < 20) {
			
		}		
		
/*
 * . Hacer un programa que reciba datos de una persona y le d� una categor�a seg�n el
siguiente criterio:
a. Adulto profesional si tiene un t�tulo y trabajo y tiene entre 20 y 50 a�os.
b. Adulto desempleado, si no tiene trabajo y tiene entre 20 y 50 a�os.
c. Joven estudiante, si estudia y tiene entre 15 y 20 a�os.
d. Joven desempleado, si no estudia y tiene entre 15 y 20 a�os.
e. Joven empleado, si no tiene t�tulo y trabaja, entre 15 y 20 a�os.
 */
	}

}
