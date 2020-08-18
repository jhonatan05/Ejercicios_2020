
public class mainCarro {

	public static void main(String[] args) {
		Carro hyundai = new Carro(4, "V8", 105.2, "Automatico", "hyundai", "Amarillo");
		System.out.println(hyundai.resumenCarro());
		hyundai.color = "Azul";
		hyundai.cantidadRuedas = 6;
		System.out.println(hyundai.color);
		System.out.println(hyundai.resumenCarro());
		
		Carro ferrari = new Carro(4, "V16", 405.2, "Manual", "Ferrari", "Rojo");
		System.out.println(ferrari.resumenCarro());
		hyundai.color = "Blanco";
		System.out.println(hyundai.resumenCarro());
		System.out.println(ferrari.resumenCarro());
		
		
		Figura cuadrado = new Figura();
		cuadrado.alto = 30;
		cuadrado.ancho = 40;
		
		System.out.println(cuadrado.obtenerArea());
		System.out.println(cuadrado.obtenerPerimetro());
	}

}
