import java.util.Scanner;

public class mainPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Persona persona = new Persona();	
		System.out.println("Digite su primer nombre");
		persona.setPrimerNombre(sc.next());
		System.out.println("Digite su primer apellido");
		persona.setPrimerApellido(sc.next());
		System.out.println("Digite su edad");
		persona.setEdad(sc.nextInt());
		System.out.println("Digite su sexo H o M");
		persona.setSexo(sc.next().charAt(0));
		System.out.println("Digite su peso");
		persona.setPeso(sc.nextDouble());
		System.out.println("Digite su altura");
		persona.setAltura(sc.nextDouble());
		System.out.println(persona.toString());
		System.out.println();
		System.out.println();
		
		System.out.println("Digite su primer nombre");
		String nombre = sc.next();
		System.out.println("Digite su primer apellido");
		String apellido = sc.next();
		System.out.println("Digite su sexo H o M");
		char sexo =sc.next().charAt(0);
		System.out.println("Digite su edad");
		Persona persona2 = new Persona(nombre, apellido, sexo);
		persona2.setEdad(sc.nextInt());
		System.out.println("Digite su peso");
		persona2.setPeso(sc.nextDouble());
		System.out.println("Digite su altura");
		persona2.setAltura(sc.nextDouble());
		System.out.println(persona2.toString());
		System.out.println();
		System.out.println();
		
		System.out.println("Digite su primer nombre");
		String nombre1 = sc.next();
		System.out.println("Digite su primer apellido");
		String apellido1 = sc.next();
		System.out.println("Digite su sexo H o M");
		char sexo1 =sc.next().charAt(0);
		System.out.println("Digite su edad");
		int edad = sc.nextInt();
		System.out.println("Digite su peso");
		double peso = sc.nextDouble();
		System.out.println("Digite su altura");
		double altura = sc.nextDouble();
		Persona persona3 = new Persona(nombre1, apellido1, sexo1, edad, 0, peso, altura);
		System.out.println(persona3.toString());
		System.out.println();
		System.out.println();
		
	}

}
