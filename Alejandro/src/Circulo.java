
public class Circulo {
	
	private double radio;
	
	public Circulo() {
		this.radio = 0;
	}
	

	//setter = establecer valor
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	//getter = obtener valor
	public double getRadio() {
		return this.radio;
	}
	
	public double obtenerArea() {
		return Math.PI * this.radio * this.radio;
	}
	
	public double obtenerPerimetro() {
		return 2 * Math.PI * this.radio;
	}

}
