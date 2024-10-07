package acceso.dam.practicajson_acilleruelosinovas;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Clase de acceso a datos para la gestión de películas.
 * Proporciona métodos para obtener una lista de películas desde un archivo JSON.
 */
public class PeliculaDAO {

    /** Instancia de ObjectMapper para la deserialización de objetos JSON. */
    public static final ObjectMapper JSON_MAPPER = new ObjectMapper();

    /**
     * Obtiene una lista de películas desde un archivo JSON.
     *
     * @return Una lista de objetos {@link Pelicula} cargados desde el archivo JSON.
     * @throws IOException Si ocurre un error al deserializar los datos.
     */
    public static List<Pelicula> obtenerPeliculas() throws IOException {
        return JSON_MAPPER.readValue(new File("src/main/resources/peliculas.json"),
                JSON_MAPPER.getTypeFactory().constructCollectionType
                        (ArrayList.class, Pelicula.class));
    }
}

