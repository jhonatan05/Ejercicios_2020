
public class Password {
	private String contraseña;
	private int longitud;
	
	public Password() {
		this.contraseña = "" ;
		this.longitud = 8;
	}
	
	public Password(int longitud) {
		this.contraseña ="";
		this.longitud = longitud;
	}
	
	public void setContrseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	public String getContrseña() {
		return this.contraseña;
	}
	public int getLongitud() {
		return this.longitud;
	}
	
	public String generarPassword() {
		for (int i = 0; i <2; i++) {
			this.contraseña = this.contraseña + (char)Math.floor(Math.random()*(90-65+1)+(65));
		}
		for (int i = 0; i < 3; i++) {
			this.contraseña = this.contraseña +  (char)Math.floor(Math.random()*(57-48+1)+(48));
		}
		for (int i = 0; i < 3; i++) {
			this.contraseña = this.contraseña + (char)Math.floor(Math.random()*(122-97+1)+(97));
		}
		return this.contraseña;
	}
}
