package biblioteca;

/**
 * Clase que implementa los libros dentro de una biblioteca.
 * Cada libro tiene titulo, autor y año de publicacion.
 *
 * @author Pablo Garrido Lopez
 * @version 7.03.25
 */

public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;


    /**
     * Constructor que inicializa un libro.
     * Incluye su autor, su titulo y su año de publicacion.
     *
     * @param titulo
     * @param autor
     * @param anioPublicacion
     */
    // TODO: Testear este método
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Metodo para obtener el autor de un libro.
     *
     * @return autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * MEtodo para obtener el año de publicacion de un libro.
     *
     * @return anioPublicacion que es el año de publicacion del libro.
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
