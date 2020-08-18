
public class Carro {
	
	//atributos del objeto
	public int cantidadRuedas;
	public String motor;
	public double caballosFuerza;
	public String tipoCajaCambios;
	public String modelo;
	public String color;
	//public, private  = modificador de acceso
	
	//constructor
	public Carro(int cantidadRuedas, String motor, double caballosFuerza, String tipoCajaCambios, String modelo, String color) {
		this.cantidadRuedas = cantidadRuedas;
		this.motor = motor;
		this.caballosFuerza = caballosFuerza;
		this.tipoCajaCambios = tipoCajaCambios;
		this.modelo = modelo;
		this.color = color;
		
	}
	
	//funciones o metodos
	public String obtenerMotor() {
		String respuesta = "El motor del carro es: " + this.motor;
		return respuesta;
	}
	
	public String resumenCarro() {
		String respuesta = "Mi carro tiene: " + this.cantidadRuedas + " ruedas "
				+ "\nEs de color: " + this.color + 
				"\nEl modelo es: " + this.modelo + 
				"\n";
		return respuesta;
	}

}
