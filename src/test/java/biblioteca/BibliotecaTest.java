package biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    private Biblioteca biblioteca;

    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
    }

    @Test
    void agregarLibro() {
        Libro libro = new Libro("El señor de los anillos", "J.R.R. Tolkien", 1937);
        biblioteca.agregarLibro(libro);

        assertTrue(biblioteca.agregarLibro(libro), "El libro se agrega correctamente");
    }

    @Test
    void eliminarLibro() {
        Libro libro = new Libro("El señor de los anillos", "J.R.R. Tolkien", 1937);
        biblioteca.agregarLibro(libro);

        assertTrue(biblioteca.eliminarLibro(libro), "El libro se elimina correctamente");
    }

    @Test
    void encuentraLibrosPorAutor() {
        Libro libro = new Libro("El señor de los anillos", "J.R.R. Tolkien", 1937);
        biblioteca.agregarLibro(libro);

        assertNotNull(biblioteca.encuentraLibrosPorAutor("J.R.R. Tolkien"),"Encuentra los libros de J.R.R Tolkien");
        assertNull(biblioteca.encuentraLibrosPorAutor("Orwell"), "Devuelve null porque no hay libros de Orwell");
    }
}