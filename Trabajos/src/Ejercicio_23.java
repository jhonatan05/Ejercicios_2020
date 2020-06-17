import java.util.*;
public class Ejercicio_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double salario = 500000;
		System.out.println("Digite cuantas horas trabajo");
		int horas = sc.nextInt();
		pago(salario, horas);
		
	}
	public static void pago (double salario, int horas) {
		if (horas>=40) {
			double pago = salario+(salario/2);
			System.out.println("su salarios con sus horas extras es de: $"+pago);
			
		}
		else {
			System.out.println("su salario es de: $"+salario);
			
		}
		
	}
}
