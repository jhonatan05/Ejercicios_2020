
public class EcuacionLineal {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	public EcuacionLineal(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
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
	public double getD() {
		return this.d;
	}
	public double getE() {
		return this.e;
	}
	public double getF() {
		return this.f;
	}
	public boolean esSolucionable() {
		if ((this.a * this.d) - (this.b * this.c ) != 0)return true;
		else return false;
	}
	public double obtenerX() {
		return ((this.e * this.d) - (this.b * this.f)) / ((this.a * this.d) - (this.b * this.c));
	}
	public double obtenerY() {
		return ((this.a * this.f) - (this.e * this.c)) / ((this.a * this.d) - (this.b * this.c));
	}
}
