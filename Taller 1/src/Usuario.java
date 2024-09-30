import java.util.ArrayList;
import java.util.List;

public class Usuario extends Persona {
List<Libro> librosPrestados;

    public Usuario(String nombre, String apellido) {
        super(nombre, apellido);
        this.librosPrestados = new ArrayList<>();
    }

    @Override
    public void mostrarDatos() {
        System.out.println("cliente " + getNombre()+" "+ getApellido());

    }

}
