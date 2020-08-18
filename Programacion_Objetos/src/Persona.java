
public class Persona {
	private String primerNombre;
	private String primerApellido;
	private int edad;
	private long documento;
	private char sexo;
	private double peso;
	private double altura;
	
	public Persona() {
		this.primerNombre = "";
		this.primerApellido = "";
		this.edad = 0;
		this.documento = 0;
		this.sexo = ' ';
		this.peso = 0;
		this.altura = 0;
	}
	
	public Persona(String nombre, String apellido, char sexo) {
		this.primerNombre = nombre;
		this.primerApellido = apellido;
		this.sexo = sexo;
		this.edad = 0;
		this.documento = 0;
		this.peso = 0;
		this.altura = 0;
	}
	
	public Persona(String nombre, String apellido, char sexo, int edad, long documento, double peso, double altura) {
		this.primerNombre = nombre;
		this.primerApellido = apellido;
		this.sexo = sexo;
		this.edad = edad;
		this.documento = documento;
		this.peso = peso;
		this.altura = altura;
	}
	
	public void setPrimerNombre(String nombre) {
		this.primerNombre = nombre;
	}
	
	public void setPrimerApellido(String apellido) {
		this.primerApellido = apellido;
	}
	/**
	 * H = hombre
	 * M = mujer
	 * @param sexo
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setDocumento(long documento) {
		this.documento = documento;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	/**
	 * Digite la altura en cm
	 * @param altura
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String getPrimerNombre() {
		return this.primerNombre;
	}
	
	public String getPrimerApellido() {
		return this.primerApellido;
	}
	
	public char getSexo() {
		return this.sexo;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public long getDocumento() {
		return this.documento;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public double calcularIMC() {
		double IMC;
		return IMC = this.peso / (Math.pow(this.altura * 0.01, 2));
	}
	
	public String esMayorDeEdad() {
		edad = this.edad;
		if (edad > 17)return "mayor de edad ";
		else return "menor de edad ";
	}
	
	public String comprobarSexo() {
		if (this.sexo == 'H' || this.sexo == 'h') return " Hombre ";
		else if (this.sexo == 'M' || this.sexo == 'm') return " Mujer ";
		else return "Sexo invalido";
	}
	
	public String toString() {
		return "El primer nombre es "+ this.primerNombre + "\nEl primer apellido es "+ this.primerApellido
				+ "\nLa edad es "+ this.edad+" y es "+ esMayorDeEdad() + "\nEl sexo es "+ comprobarSexo() + "\nEl documento es " 
				+ generarDocumento() + "\nLa altura es " + this.altura + "\nEl peso es "+ this.peso+ "\nEl IMC es " + calcularIMC();
	}
	
	public long generarDocumento() {
		return this.documento = (long)Math.floor(Math.random()*(99999999-10000000+1)+(10000000));
	}
}
