
public class Ejercicio_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra= "hola madre";
		int suma = 0;
		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(i)=='a') {
				suma = suma + 1;
			}
		}
		System.out.println("El total de la suma de las 'a' es: " +suma);
	}

}
//Escribir un algoritmo para contar el numero de veces que aparece la letra "a" en una cadena
