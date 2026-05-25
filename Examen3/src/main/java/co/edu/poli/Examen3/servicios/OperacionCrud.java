package co.edu.poli.Examen3.servicios;
import co.edu.poli.Examen3.modelo.Examen;
import co.edu.poli.Examen3.modelo.Orina;
public interface OperacionCrud {

  
    String crear(Examen p);

   
    Examen leer(String id);

    
    String actualizar(String id, Examen p);


    String eliminar(String id);
}