import java.util.*;
public class Ejercicio_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite su dia de nacimiento");
		int dia = sc.nextInt();
		System.out.println("Digite el mes en que nacio en numeros");
		int mes = sc.nextInt();
		System.out.println("Digite el a�o en que nacio");
		int a�o =sc.nextInt();
		int a�o1 = (a�o%10);
		int a�o2= (a�o/10)%10;
		String fecha = fechaNaciemiento(dia, mes, a�o2, a�o1);
		System.out.println(fecha);
	}
	public static String fechaNaciemiento(int dia, int mes , int a�o2, int a�o1) {
		return(dia+"/"+mes+"/"+a�o2+""+a�o1);
	}
}
