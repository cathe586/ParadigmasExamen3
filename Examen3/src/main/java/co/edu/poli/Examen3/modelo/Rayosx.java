package co.edu.poli.Examen3.modelo;

public class Rayosx extends Examen {
	private String zonadelcuerpo;
	private String nivelderadiacion;

	public Rayosx(String nombre, String id, String fechaderealizado, String Costo) {
		super(nombre, id, fechaderealizado, Costo);
		
	}

	public String getZonadelcuerpo() {
		return zonadelcuerpo;
	}

	public void setZonadelcuerpo(String zonadelcuerpo) {
		this.zonadelcuerpo = zonadelcuerpo;
	}

	public String getNivelderadiacion() {
		return nivelderadiacion;
	}

	public void setNivelderadiacion(String nivelderadiacion) {
		this.nivelderadiacion = nivelderadiacion;
	}
	}
	
    