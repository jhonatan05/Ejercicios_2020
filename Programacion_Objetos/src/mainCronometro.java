import java.util.Scanner;

public class mainCronometro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Cronometro sc = new Cronometro();
		sc.iniciar();
		for (int i = 0; ; i++) {
			System.out.println("Desea para el cronometro");
			System.out.println("1 = Si y 2 = No");
			int parar = in.nextInt();
			if (parar == 1) {
				sc.parar();
				System.out.println("El cronometro paro en: "+(sc.obtenerTiempoTranscurrido())/1000+" segundos");
				break;
			}
			else {
				sc.parar();
				System.out.println((sc.obtenerTiempoTranscurrido())/1000);
				
			}
			
		}
	}


}
