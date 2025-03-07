package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona una biblioteca, permitiendo añadir, eliminar, buscar y
 * enlistar libros.
 *
 * @see Libro
 * @author Pablo Garrido Lopez
 * @version 7.03.25
 */
public class Biblioteca {

    /**
     *Lista de libros incluídos dentro de la biblioteca.
     */
    private final List<Libro> libros;

    /**
     * Constructor por defecto que inicializa la biblioteca.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * Constructor que inicializa la biblioteca una vez ya tiene una lista de libros.
     *
     * @param libros
     */
    //  Test: NO HAY QUE TESTEAR ESTE METODO
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Metodo para añadir un libro a la biblioteca.
     *
     * @param libro
     * @return boolean.
     */
    // TODO: Testear este metodo.
    //  Test: Comprobar si se ha agregado
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    /**
     * Metodo para eliminar un libro de la biblioteca.
     *
     * @param libro
     * @return boolean.
     */
    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    /**
     * Metodo para conocer la lista de libros que hay en la biblioteca.
     *
     * @return Lista de libros.
     */
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * Metodo para encontrar un libro en concreto por su titulo.
     *
     * @param titulo del libro.
     * @return el libro encontrado o null si no existe el libro.
     */
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Metodo para encontrar un libro por su autor.
     *
     * Este metodo está obsoleto desde la versión 2.0, sustituido por:
     * {@link #encuentraLibrosPorAutor(String)}.
     *
     * @deprecated este metodo esta obsoleto desde la version 2.0, sustituido por:
     * {@link #encuentraLibrosPorAutor(String)}.
     *
     * @param autor del libro.
     * @return El libro encontrado de ese autor o null si no existe ninguno.
     */
    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo
    @Deprecated
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Busca todos los libros escritos por un autor en concreto.
     *
     * Este metodo solo esta disponible desde la version 2.0.
     * @since 2.0
     *
     * @param autor de los libros buscados.
     * @return Lista de libros escritos por el autor o null si no existe ninguno.
     */
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
