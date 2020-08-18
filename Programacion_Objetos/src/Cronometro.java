
public class Cronometro {
	private long inicioTiempo;
	private long finTiempo;

	public long tiempoActual() {
		return System.currentTimeMillis();
	}
	public Cronometro() {
		this.inicioTiempo = tiempoActual();

	}
	public void iniciar() {
		this.inicioTiempo = tiempoActual();
	}
	public void parar() {
		this.finTiempo = tiempoActual();
	}

	public long obtenerTiempoTranscurrido() {
		return this.finTiempo-this.inicioTiempo;
	}
}
