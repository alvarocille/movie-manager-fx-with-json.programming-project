package acceso.dam.practicajson_acilleruelosinovas;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase principal de la aplicación JavaFX que gestiona el ciclo de vida de la interfaz gráfica.
 * Inicia la aplicación y carga la vista de películas.
 *
 * @author alvaro.cilsin
 * @version 1.0
 * @location IES Ribera de Castilla
 * @grade DAM2
 *
 */
public class Main extends Application {

    /**
     * Metodo que se ejecuta al iniciar la aplicación.
     * Carga el archivo FXML correspondiente a la interfaz de usuario y establece la escena.
     *
     * @param stage La ventana principal de la aplicación.
     * @throws IOException Si ocurre un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/peliculas.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Peliculas.");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Metodo principal que lanza la aplicación.
     *
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        launch();
    }
}
