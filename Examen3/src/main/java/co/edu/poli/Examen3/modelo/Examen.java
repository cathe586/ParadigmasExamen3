package co.edu.poli.Examen3.modelo;

import java.io.Serializable;
public  class Examen implements Serializable {

    private String NombrePaciente;
    private String CodigoExamen;
    private String fechaderealizado;
    private String Costo;
    public Examen(String NombrePaciente, String CodigoExamen, String fechaderealizado, String Costo) {

    this.NombrePaciente = NombrePaciente;
    this.CodigoExamen = CodigoExamen;
    this.fechaderealizado = fechaderealizado;
    this.Costo = Costo;
    }
	public String getNombrePaciente() {
		return NombrePaciente;
	}
	public void setNombrePaciente(String nombrePaciente) {
		NombrePaciente = nombrePaciente;
	}
	public String getCodigoExamen() {
		return CodigoExamen;
	}
	public void setCodigoExamen(String codigoExamen) {
		CodigoExamen = codigoExamen;
	}
	public String getFechaderealizado() {
		return fechaderealizado;
	}
	public void setFechaderealizado(String fechaderealizado) {
		this.fechaderealizado = fechaderealizado;
	}
	public String getCosto() {
		return Costo;
	}
	public void setCosto(String costo) {
		Costo = costo;
	}
}