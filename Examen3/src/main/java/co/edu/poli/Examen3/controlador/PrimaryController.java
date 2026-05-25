package co.edu.poli.Examen3.controlador;
import co.edu.poli.Examen3.modelo.Orina;
import co.edu.poli.Examen3.modelo.Examen;
import co.edu.poli.Examen3.servicios.ImplementacionCrud;
import co.edu.poli.Examen3.servicios.OperacionCrud;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PrimaryController {

	private ImplementacionCrud crud = new ImplementacionCrud();

    @FXML private TextField txtCodigoExamen;
    @FXML private TextField txtNombrePaciente;

    @FXML private TableView<Examen> tabla;
    @FXML private TableColumn<Examen, String> colCodigoExamen;
    @FXML private TableColumn<Examen, String> colNombrePaciente;

    private ObservableList<Examen> lista = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        colCodigoExamen.setCellValueFactory(new PropertyValueFactory<>("CodigoExamen"));
        colNombrePaciente.setCellValueFactory(new PropertyValueFactory<>("NombrePaciente"));
    }

    @FXML
    void crear() {
        String CodigoExamen = txtCodigoExamen.getText();
        String NombrePaciente = txtNombrePaciente.getText();

        Examen  nuevo = new Examen ("CodigoExamen", "NombrePaciente","Costo", "Ph");

        crud.crear(nuevo);
        listar();
    }

    @FXML
    void leer() {
        Examen p = crud.leer(txtCodigoExamen.getText());
        if (p != null) {
            txtNombrePaciente.setText(p.getNombrePaciente());
        }
    }

    @FXML
    void actualizar() {
        String CodigoExamen = txtCodigoExamen.getText();
        String NombrePaciente = txtNombrePaciente.getText();

        Examen p = new Examen ("CodigoExamen", "NombrePaciente","Costo", "Ph");

        crud.actualizar(CodigoExamen, p);
        listar();
    }

    @FXML
    void eliminar() {
        crud.eliminar(txtCodigoExamen.getText());
        listar();
    }

    @FXML
    void listar() {
        lista.clear();

        for (Examen p : crud.getLista()) {
            if (p != null) {
                lista.add(p);
            }
        }

        tabla.setItems(lista);
    }

    @FXML
    void guardar() {
        crud.Serializar(crud.getLista(), "./", "datos.dat");
    }

    @FXML
    void cargar() {
        crud.Deserializar("./", "datos.dat");
        listar();
    }
}
}
