
public class mainCirculo {

	public static void main(String[] args) {
		Circulo c = new Circulo();
		System.out.println(c.getRadio());
		
		c.setRadio(8);
		
		double miRadio = c.getRadio();
		System.out.println(miRadio);
		double area = c.obtenerArea();
		double p = c.obtenerPerimetro();
		System.out.println("El area es: " + area);
		System.out.println("El perimetro es: " + p);
	}

}
