/**
 * 
 * @author jonat
 *
 */
public class Ventilador {
	public final int LENTO = 1;
	public final int MEDIO = 2;
	public final int RAPIDO = 3;
	private int velocidad;
	private boolean encendido;
	private double radio;
	private String color;

	public Ventilador() {
		this.velocidad = this.LENTO;
		this.encendido = false;
		this.radio = 5;
		this.color = "rojo";
	}
	public void setVelodidad(int velocidad) {
		this.velocidad = velocidad;
	}
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	public void setRadio( double radio) {
		this.radio = radio;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getVelocidad() {
		return this.velocidad;
	}
	public boolean getEncendido() {
		return this.encendido;
	}
	public double getRadio() {
		return this.radio;
	}
	public String getColor() {
		return this.color;
	}
	/**
	 * Metodo para encender o apagar el ventilador
	 * @param numero 1= encendido, 2=apagado
	 * @return si esta encendido o apagado
	 */
	public boolean encendido(int numero) {
		if(numero == 1)return this.encendido = true;
		else return this.encendido = false;
	}
	public String toString() {
		if (encendido) {
			if (this.velocidad == this.LENTO) {
				return "La velocidad del ventilador: "+"LENTA"+", el color es "+this.color+" y el radio es "+this.radio ;
			}
			else if (this.velocidad == this.MEDIO) {
				return "La velocidad del ventilador: "+"MEDIA"+", el color es "+this.color+" y el radio es "+this.radio ;
			}
			else {
				return "La velocidad del ventilador: "+"RAPIDA"+", el color es "+this.color+" y el radio es "+this.radio ;
			}
		}
		else {
			return "El color del ventilador es "+this.color +", el radio es " + this.radio + " y el ventilador se encuentra apagado";
		}
	}
}
