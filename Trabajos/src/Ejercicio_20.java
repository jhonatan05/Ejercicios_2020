import java.util.*;
public class Ejercicio_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite su dia de nacimiento");
		int dia = sc.nextInt();
		System.out.println("Digite el mes en que nacio en numeros");
		int mes = sc.nextInt();
		System.out.println("Digite el año en que nacio");
		int año =sc.nextInt();
		int año1 = (año%10);
		int año2= (año/10)%10;
		String fecha = fechaNaciemiento(dia, mes, año2, año1);
		System.out.println(fecha);
	}
	public static String fechaNaciemiento(int dia, int mes , int año2, int año1) {
		return(dia+"/"+mes+"/"+año2+""+año1);
	}
}
