
public class Password {
	private String contrase�a;
	private int longitud;
	
	public Password() {
		this.contrase�a = "" ;
		this.longitud = 8;
	}
	
	public Password(int longitud) {
		this.contrase�a ="";
		this.longitud = longitud;
	}
	
	public void setContrse�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	public String getContrse�a() {
		return this.contrase�a;
	}
	public int getLongitud() {
		return this.longitud;
	}
	
	public String generarPassword() {
		for (int i = 0; i <2; i++) {
			this.contrase�a = this.contrase�a + (char)Math.floor(Math.random()*(90-65+1)+(65));
		}
		for (int i = 0; i < 3; i++) {
			this.contrase�a = this.contrase�a +  (char)Math.floor(Math.random()*(57-48+1)+(48));
		}
		for (int i = 0; i < 3; i++) {
			this.contrase�a = this.contrase�a + (char)Math.floor(Math.random()*(122-97+1)+(97));
		}
		return this.contrase�a;
	}
}
