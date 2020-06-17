import java.util.*;
public class Ejercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double articulo ;
		double ganancia;
		double ValorVenta;
		System.out.println("¿Cual es el precio del articulo que compro?");
		articulo = sc.nextDouble();
		ganancia= articulo*0.20;
		ValorVenta = articulo + ganancia;
		System.out.println("Este es el precio por el que lo debes vender"+ ValorVenta);
		
		
		
		
		
/*
 * El dueño de una tienda compra un artículo a un precio determinado. Obtener el precio
en que lo debe vender para obtener una ganancia del 20%
 */
	}

}
