package acceso.dam.practicajson_acilleruelosinovas;

/**
 * Clase que representa una película.
 * Contiene información sobre el título, la fecha, el director y el género de la película.
 */
public class Pelicula {
    private int id;
    private String titulo;
    private String fecha;
    private String director;
    private String genero;

    /**
     * Constructor que inicializa los atributos de la película.
     *
     * @param id      El identificador único de la película.
     * @param titulo  El título de la película.
     * @param fecha   La fecha de estreno de la película.
     * @param director El director de la película.
     * @param genero  El género de la película.
     */
    public Pelicula(int id, String titulo, String fecha, String director, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.fecha = fecha;
        this.director = director;
        this.genero = genero;
    }

    /**
     * Constructor por defecto. Necesario para Jackson.
     */
    public Pelicula() {}

    /**
     * Obtiene el identificador de la película.
     * @return El identificador de la película.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador de la película.
     * @param id El nuevo identificador de la película.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el título de la película.
     * @return El título de la película.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título de la película.
     * @param titulo El nuevo título de la película.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene la fecha de estreno de la película.
     * @return La fecha de estreno de la película.
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de estreno de la película.
     * @param fecha La nueva fecha de estreno de la película.
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el director de la película.
     * @return El director de la película.
     */
    public String getDirector() {
        return director;
    }

    /**
     * Establece el director de la película.
     * @param director El nuevo director de la película.
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * Obtiene el género de la película.
     * @return El género de la película.
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece el género de la película.
     * @param genero El nuevo género de la película.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Devuelve una representación en cadena de la película.
     * @return Una cadena que representa el título y la fecha de la película.
     */
    @Override
    public String toString() {
        return titulo + " de " + fecha;
    }
}
