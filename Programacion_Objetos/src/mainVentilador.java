import java.util.Scanner;

public class mainVentilador {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Ventilador ventilador = new Ventilador();
		System.out.println("¿De que color es su ventilador?");
		String color = in.next();
		ventilador.setColor(color);
		System.out.println("¿Desea encender el ventilador?");
		System.out.println("1 = si o 2 = no");
		int numero = in.nextInt();
		if (numero == 1) {
			System.out.println("¿A que velocidad desea el ventilador");
			System.out.println("1 = Lento");
			System.out.println("2 = Medio");
			System.out.println("3 = Rapido");
			int velocidad= in.nextInt();
		ventilador.setVelodidad(velocidad);
			ventilador.encendido(numero);
			System.out.println(ventilador.toString());
		}
		else {
			System.out.println(ventilador.toString());
		}
		
		
	}

}
