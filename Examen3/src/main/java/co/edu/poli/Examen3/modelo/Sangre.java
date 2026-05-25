package co.edu.poli.Examen3.modelo;

public class Sangre extends Examen {
	private String rh;
	private String tipodesangre;
	
	public Sangre(String nombre, String id, String fechaderealizado, String Costo) {
		super(nombre, id, fechaderealizado, Costo);
	}
	
	public String getRh() {
		return rh;
	}
	public void setRh(String rh) {
		this.rh = rh;
	}
	public String getTipodesangre() {
		return tipodesangre;
	}
	public void setTipodesangre(String tipodesangre) {
		this.tipodesangre = tipodesangre;
	}
	
	

}
