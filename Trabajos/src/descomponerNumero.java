
public class descomponerNumero {

	public static void main(String[] args) {
		int anio = 1987; 
		for(int i = 1; i <= 1000; i*=10) {
			System.out.println((anio / i) % 10);
		}
		
		for(int i = 1000; i >= 1; i/=10) {
			System.out.println((anio / i) % 10);
		}

	}

}
