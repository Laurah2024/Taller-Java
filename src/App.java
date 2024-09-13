import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        List<Libro> listaDelibros = new ArrayList<>();

        // Crear libros
        Libro libro1 = new Libro(" Como programar en una noche", "Laura", 1, true);
        Libro libro2 = new Libro(" Como dormir bien", "LHC", 2, true);
        listaDelibros.add(libro1);
        listaDelibros.add(libro2);
        System.out.println("Hay un total de " + listaDelibros.size() + " libros");
        // Crear usuario
        Usuario usuario = new Usuario(" Camila", "Real");

        // Crear bibliotecario
        Bibliotecario bibliotecario = new Bibliotecario("Estefanía", "Gómez");

        // Mostrar datos
        usuario.mostrarDatos();
        bibliotecario.mostrarDatos();

        // Prestar libros
        bibliotecario.prestarLibro(usuario, libro1);
        bibliotecario.prestarLibro(usuario, libro2);

        // Devolver libro
        bibliotecario.devolverLibro(usuario, libro1);
    }
}
