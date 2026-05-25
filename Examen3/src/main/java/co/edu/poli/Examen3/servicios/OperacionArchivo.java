package co.edu.poli.Examen3.servicios;
import co.edu.poli.Examen3.modelo.*;

public interface OperacionArchivo {
    
    
    public String Serializar(Examen[] examen, String path, String name);

   
    public Examen[] Deserializar(String path, String name);
}