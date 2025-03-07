package biblioteca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {
    @Test
    void construtorLibro() {

        Libro libro = new Libro("El señor de los anillos", "J.R.R. Tolkien", 1937);

        assertEquals("El señor de los anillos", libro.getTitulo(), "Titulo del libro");
        assertEquals("J.R.R. Tolkien", libro.getAutor(), "Autor del libro");
        assertEquals(1937, libro.getAnioPublicacion(), "Año de publicacion del libro");
    }
}