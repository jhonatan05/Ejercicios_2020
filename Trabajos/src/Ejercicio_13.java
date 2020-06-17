import java.util.*;
public class Ejercicio_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
double notas = 0, notaF, notaP=0;
int i1 =3 ;
for (int i = 1; i1 >= i; i++ ) {
	System.out.println("Digite su nota");
	notas =sc.nextDouble();
	notaP = notaP + notas;
	
}
notaF = notaP/3;
System.out.println("Su nota final es de: "+notaF);
	}

}
