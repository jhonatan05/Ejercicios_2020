import java.util.Date;

public class Cuenta {
	private int id;
	private double saldoCuenta;
	private Date fechaCreacion;
	
	public Cuenta() {
		this.id = 0;
		this.saldoCuenta = 2000;
		this.fechaCreacion = new Date();
	}
	
	public Cuenta(int id, double saldoCuenta) {
		this.id = id;
		this.saldoCuenta = saldoCuenta;
		this.fechaCreacion = new Date();
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setSaldoCuenta(double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}
	
	public int getId() {
		return this.id;
	}
	
	public double getSaldoCuenta() {
		return this.saldoCuenta;
	}
	
	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}
	
	public void retiro(double retiro) { //las acciones son casi siemmpre void
		this.saldoCuenta = this.saldoCuenta - retiro ;
	}
	
	public void deposito(double deposito) {
		this.saldoCuenta = this.saldoCuenta + deposito;

	}

}
