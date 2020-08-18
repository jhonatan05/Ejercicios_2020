
public class mainPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i = 0; i <2; i++) {
//			char documento = (char)Math.floor(Math.random()*(90-65+1)+(65));
//		System.out.print(documento);
//		}
//		for (int i = 0; i < 3; i++) {
//			char documento = (char)Math.floor(Math.random()*(57-48+1)+(48));
//		System.out.print(documento);
//		}
//		for (int i = 0; i < 3; i++) {
//			char documento = (char)Math.floor(Math.random()*(122-97+1)+(97));
//		System.out.print(documento);
//		}
		Password pass = new Password();
		System.out.print(pass.generarPassword());
	
	}

}
