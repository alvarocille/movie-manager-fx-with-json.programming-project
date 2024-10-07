package acceso.dam.practicajson_acilleruelosinovas;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.util.List;

import static acceso.dam.practicajson_acilleruelosinovas.PeliculaDAO.obtenerPeliculas;

/**
 * Controlador para la interfaz de la aplicación que gestiona películas.
 * Permite cargar, visualizar e interactuar con una lista de películas.
 */
public class PeliculasControlador {

    /** Campo de texto para el título de la película. */
    @FXML
    public TextField tfTitulo;

    /** Campo de texto para la fecha de la película. */
    @FXML
    public TextField tfFecha;

    /** Campo de texto para el género de la película. */
    @FXML
    public TextField tfGenero;

    /** Campo de texto para el director de la película. */
    @FXML
    public TextField tfDirector;

    /** Botón para importar películas desde un archivo. */
    @FXML
    public Button btnImportar;

    /** ListView para mostrar la lista de películas. */
    @FXML
    public ListView<Pelicula> lvPeliculas;

    /**
     * Metodo de inicialización que se ejecuta automáticamente al cargar la vista.
     * Carga los datos de las películas en el ListView.
     */
    public void initialize() {
        cargarDatos();
    }

    /**
     * Maneja la acción del botón "Importar" para cargar los datos de las películas (actualmente innecesario).
     */
    public void importar() {
        cargarDatos();
    }

    /**
     * Carga los datos de las películas en el ListView.
     * Limpia la lista existente y luego obtiene las películas de la fuente de datos.
     */
    public void cargarDatos() {
        lvPeliculas.getItems().clear();
        try {
            List<Pelicula> peliculas = obtenerPeliculas();
            lvPeliculas.setItems(FXCollections.observableList(peliculas));
        } catch (Exception e) {
            System.out.println("Error cargando los datos de la aplicación: " + e.getMessage());
        }
    }

    /**
     * Maneja la selección de una película en el ListView y carga sus detalles en los campos de texto.
     */
    public void seleccionarPelicula() {
        Pelicula peliculaSeleccionada = lvPeliculas.getSelectionModel().getSelectedItem(); // Pelicula que es seleccionada en la lista.
        if (peliculaSeleccionada != null) {
            cargarPelicula(peliculaSeleccionada);
        }
    }

    /**
     * Carga los detalles de la película seleccionada en los campos de texto.
     * @param peliculaSeleccionada La película seleccionada en el ListView.
     */
    private void cargarPelicula(Pelicula peliculaSeleccionada) {
        tfTitulo.setText(peliculaSeleccionada.getTitulo());
        tfFecha.setText(peliculaSeleccionada.getFecha());
        tfGenero.setText(peliculaSeleccionada.getGenero());
        tfDirector.setText(peliculaSeleccionada.getDirector());
    }
}
