import java.util.Scanner;

public class mainCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Cuenta cuenta = new Cuenta(1, 1000);
		while (true) {
			System.out.println("¿Que desea realizar");
			System.out.println("1 = Revisar el saldo de cuenta ");
			System.out.println("2 = Retirar dinero");
			System.out.println("3 = Depositar dinero");
			System.out.println("4 = Cambiar id");
			System.out.println("5 = Mirar la fecha de creacion de la cuenta");
			int respuesta = in.nextInt();
			if (respuesta == 1) {
				System.out.println("Su saldo es de: $"+cuenta.getSaldoCuenta());
			}
			else if (respuesta == 2) {
				System.out.println("¿Cuanto dinero desea retirar?");
				double retirar = in.nextDouble();
				 cuenta.retiro(retirar);
				System.out.println("Usted retiro $"+ retirar + " y le quedo en la cuenta $"+cuenta.getSaldoCuenta());
			}
			else if (respuesta == 3) {
				System.out.println("¿Cuanto dinero desea depositar?");
				double depositar = in.nextDouble();
				 cuenta.deposito(depositar);
				System.out.println("Usted deposito $"+depositar+", el total de la cuenta quedo en $"+cuenta.getSaldoCuenta());
			}
			else if (respuesta == 4) {
				System.out.println("Digite un nuevo numero id de su cuenta");
				int id = in.nextInt();
				cuenta.setId(id);
				System.out.println("Su nuevo id es:"+cuenta.getId());
			}
			else if (respuesta == 5) {
				System.out.println("la fecha de creacion de su cuenta es del: "+cuenta.getFechaCreacion());
			}
			else {
				System.out.println("Numero invalido");
			}
			System.out.println();
			System.out.println("Desea realizar otro metodo");
			System.out.println("1 = SI o 2 = NO");
			int respuesta1 = in.nextInt();
			
			if (respuesta1 == 2) {
				break;
			}
		}
		
	}

}
