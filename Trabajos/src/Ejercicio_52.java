import java.util.Scanner;

public class Ejercicio_52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean verdadero = true;
		boolean falso = false;
		System.out.println(" A   "+ " B   "+ "  � ");
		System.out.println(verdadero+ "  "+ verdadero+ "  "+ decision(verdadero, verdadero)); 
		System.out.println(verdadero+ "  "+ falso+ " "+ decision(verdadero, falso));
		System.out.println(falso+ " "+ verdadero+ "  "+ decision(falso, verdadero));
		System.out.println(falso+ " "+ falso+ " "+ decision(falso, falso));
	}
	public static boolean decision (boolean verdad, boolean fals) {
		return verdad || fals;
	}
	
	/*
	 * Hacer una funci�n (m�todo en java) que retorne falso o verdadero seg�n la tabla de
verdad del �o� l�gico.
	 */
}
