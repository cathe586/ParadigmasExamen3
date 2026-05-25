package co.edu.poli.Examen3.servicios;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import co.edu.poli.Examen3.modelo.*;




public class ImplementacionCrud implements OperacionCrud, OperacionArchivo {

    private Examen[] lista = new Examen[10];

    // --- TU CÓDIGO ORIGINAL (CRUD) ---

    @Override
    public String crear(Examen p) {
        if (p == null) {
            return "Error: objeto vacío";
        }

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == null) {
                lista[i] = p;
                return "Creado correctamente";
            }
        }

        return "Error: lista llena";
    }

    @Override
    public Examen leer(String CodigoExamen) {
        for (Examen p : lista) {
            if (p != null && p.getCodigoExamen().equals(CodigoExamen)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public String actualizar(String CodigoExamen, Examen nuevo) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null && lista[i].getCodigoExamen().equals(CodigoExamen)) {
                lista[i] = nuevo;
                return "Actualizado correctamente";
            }
        }
        return "No encontrado";
    }

    @Override
    public String eliminar(String CodigoExamen) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null && lista[i].getCodigoExamen().equals(CodigoExamen)) {
                lista[i] = null;
                return "Eliminado correctamente";
            }
        }
        return "No encontrado";
    }

  

    @Override
    public String Serializar(Examen[] examen, String path, String name) {
        try {
            FileOutputStream archivo = new FileOutputStream(path + name);
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            salida.writeObject(examen);
            salida.close();
            archivo.close();
            return "Archivo guardado exitosamente";
        } catch (IOException e) {
            return "Error al serializar: " + e.getMessage();
        }
    }

    @Override
    public Examen[] Deserializar(String path, String name) {
    	Examen[] personalRecuperado = null;
        try {
            FileInputStream archivo = new FileInputStream(path + name);
            ObjectInputStream entrada = new ObjectInputStream(archivo);
            personalRecuperado = (Examen[]) entrada.readObject();
            this.lista = personalRecuperado;
            entrada.close();
            archivo.close();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al deserializar: " + e.getMessage());
        }
        return personalRecuperado;
    }

   
    public Examen[] getLista() {
        return lista;
    }
}