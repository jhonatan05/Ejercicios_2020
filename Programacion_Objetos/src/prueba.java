
public class prueba {
	
	    
	    // Definici�n de las propiedades de la clase
	    private int numeroCuenta;
	    private double saldo;
	    
	    public prueba(int cuenta, double inicial) {
	        numeroCuenta = cuenta;
	        saldo = inicial;
	    } // Fin del constructor cuenta

	    public void depositar(double cantidad) {
	        saldo = saldo + cantidad;
	    } // Fin del m�todo depositar

	    public void retirar(double cantidad) {
	        saldo = saldo - cantidad;
	    } // Fin del m�todo retirar

	    public double saldo() {
	        return saldo;
	    } // Fin del m�todo saldo    
	    
	
}
