import java.util.Scanner;


public class Principal {

	public static void main(String [] args) {
		 
		   String cadena="";
		   Scanner frase=new Scanner(System.in);
		    char [] Arraycadena ;
		    char caracter ;
		    int contador =0;
		 
		 
		    System.out.println("Introduce una frase: ");
		    cadena=frase.nextLine().replace(" ", "");
		    Arraycadena=cadena.toCharArray();
		    for(int i =0;i<Arraycadena.length;i++){
		        caracter = Arraycadena[i];
		        for(int j=0;j<Arraycadena.length;j++){
		            if(Arraycadena[i]==caracter ){
		                contador++;
		            }
		        }
		 
		       System.out.println(Arraycadena[i]+" "+contador+" veces.");
		 
		        contador= 0;
		    }
		    
		     
		    
	}
}