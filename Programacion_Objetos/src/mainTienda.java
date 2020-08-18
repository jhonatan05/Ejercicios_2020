import java.util.Scanner;

public class mainTienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Digite el diminutivo de su tienda");
		String diminutivo = in.next();
		System.out.println("Digite el nombre de su tienda");
		String nombre = in.next();
		
		
		Tienda sc = new Tienda(diminutivo, nombre);
		System.out.println("El diminutivo de la tienda es: "+ diminutivo+
				", el nombre es: "+ nombre +" y la ganancia es de: $"+ sc.ganancia() );
		
		sc.precioActual = 200000;
		sc.precioAntesDeCierre = 300000;
	}

}
