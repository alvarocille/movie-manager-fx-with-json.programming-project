package acceso.dam.practicajson_acilleruelosinovas;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import java.util.List;

import static acceso.dam.practicajson_acilleruelosinovas.PeliculaDAO.obtenerPeliculas;

public class PeliculasControlador {
    @FXML
    public TextField tfTitulo;
    @FXML
    public TextField tfFecha;
    @FXML
    public TextField tfGenero;
    @FXML
    public TextField tfDirector;
    @FXML
    public Button btnImportar;
    @FXML
    public ListView<Pelicula> lvPeliculas;
    
    private Pelicula peliculaSeleccionada;

    public void initialize() {
        cargarDatos();
    }

    public void importar(ActionEvent actionEvent) {
        cargarDatos();
    }

    public void cargarDatos() {
        lvPeliculas.getItems().clear();
        try {
            List<Pelicula> peliculas = obtenerPeliculas();
            lvPeliculas.setItems(FXCollections.observableList(peliculas));
        } catch (Exception e) {
            System.out.println("Error cargando los datos de la aplicación: " + e.getMessage());
        }
    }

    public void seleccionarPelicula(MouseEvent mouseEvent) {
        peliculaSeleccionada = lvPeliculas.getSelectionModel().getSelectedItem();
        cargarPelicula(peliculaSeleccionada);
    }

    private void cargarPelicula(Pelicula peliculaSeleccionada) {
        tfTitulo.setText(peliculaSeleccionada.getTitulo());
        tfFecha.setText(peliculaSeleccionada.getFecha());
        tfGenero.setText(peliculaSeleccionada.getGenero());
        tfDirector.setText(peliculaSeleccionada.getDirector());
    }
}