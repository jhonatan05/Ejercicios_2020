
public class Tienda {
	public String diminutivo;
	public String nombre;
	public double precioAntesDeCierre;
	public double precioActual;

	public Tienda(String Diminutivo, String Nombre) {
		this.diminutivo = Diminutivo;
		this.nombre = Nombre;
		this.precioActual = 100000;
		this.precioAntesDeCierre = 50000;
	}
	public double ganancia() {
		return this.precioActual - this.precioAntesDeCierre;
	}
}
