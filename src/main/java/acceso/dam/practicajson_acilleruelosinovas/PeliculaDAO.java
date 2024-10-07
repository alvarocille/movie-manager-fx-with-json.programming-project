package acceso.dam.practicajson_acilleruelosinovas;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PeliculaDAO {
    public static final ObjectMapper JSON_MAPPER = new ObjectMapper();

    public static List<Pelicula> obtenerPeliculas() throws IOException {
        return JSON_MAPPER.readValue(new File("src/main/resources/peliculas.json"),
                JSON_MAPPER.getTypeFactory().constructCollectionType
                        (ArrayList.class, Pelicula.class));
    }
}
