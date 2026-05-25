package co.edu.poli.Examen3.modelo;
import java.io.Serializable;
public class Orina extends Examen {
	private String NivelGlucosa;
	private String Ph;
	
	public Orina(String NombrePaciente, String CodigoExamen, String fechaderealizado, String Costo) {
		super(NombrePaciente, CodigoExamen, fechaderealizado, Costo);
		
	}

	public String getNivelGlucosa() {
		return NivelGlucosa;
	}

	public void setNivelGlucosa(String nivelGlucosa) {
		NivelGlucosa = nivelGlucosa;
	}

	public String getPh() {
		return Ph;
	}

	public void setPh(String ph) {
		Ph = ph;
	}
	
	
	
	 
}
