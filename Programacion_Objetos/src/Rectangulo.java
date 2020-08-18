
public class Rectangulo {

	public double alto;
	public double ancho;
	
	public Rectangulo() {
		this.alto = 0;
		this.ancho = 0;
	}
	public Rectangulo(double alto, double ancho) {
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public double obtenerArea() {
		return this.alto*this.ancho;
	}
	public double obtenerPerimetro() {
		return (this.alto*2)+(this.ancho*2);
	}
	
		
	}
	


