import java.util.Date;

public class TiempoActual {

	public static void main(String[] args) {
		long inicioTiempo = System.currentTimeMillis();
		
		long nuestroF = f(150);
		
		long finTiempo = System.currentTimeMillis();
		
		System.out.println((finTiempo - inicioTiempo)/1000);
		
//		Date fecha;
//		fecha = new Date();
//		System.out.println(fecha);
	}
	
	public static long f(long n) {
		if(n == 1) return 1;
		else if(n == 2) return 0;
		else return f(n-1) + f(n-2);
	}

}
