
public class EcuacionCuadratica {
	private double a;
	private double b;
	private double c;
	
	public EcuacionCuadratica(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double getA() {
		return this.a;
	}
	public double getB() {
		return this.b;
	}
	public double getC() {
		return this.c;
	}
	private double obtenerDiscriminante() {
		return (Math.pow(this.b, 2)) - (4 * this.a*this.c);
	}
	public double obtenerRaiz1() {
		double discriminante = obtenerDiscriminante();
		if (discriminante > 0)return (-this.b - Math.sqrt(discriminante)) / (2*this.a);
		else return 0;
	}
	public double obtenerRaiz2() {
		double discriminante = obtenerDiscriminante();
		if (discriminante > 0)return (-this.b + Math.sqrt(discriminante)) / (2*this.a);
		else return 0;
	}
}
