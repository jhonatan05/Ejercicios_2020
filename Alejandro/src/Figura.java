
public class Figura {
	
	public int alto;
	public int ancho;
	
	public Figura() {
		this.alto = 0;
		this.ancho = 0;
	}
	
	public String resumen() {
		return "Mi figura tiene un alto de " + this.alto + "cm y un ancho de: " + this.ancho + "cm";
	}
	
	public int obtenerArea() {
		return this.alto * this.ancho;
	}
	
	public int obtenerPerimetro() {
		return (this.alto * 2) + (this.ancho * 2);
	}

}
