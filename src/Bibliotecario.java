public class Bibliotecario extends Persona implements Gestionable {

    public Bibliotecario(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Empleado " + getNombre() + " " + getApellido());
    }

    @Override
    public void prestarLibro(Usuario usuario, Libro libro) {
        if (usuario.librosPrestados.size() > 3) {
            System.out.println("El usuario alcanzó el máximo de préstamos permitidos");
        } else {
            libro.prestar();
            usuario.librosPrestados.add(libro);
            System.out.println(
                    "El libro:" + libro.getTitulo() + " se le ha prestado a" + usuario.getNombre() + " "
                            + usuario.getApellido());
        }
    }

    @Override
    public void devolverLibro(Usuario usuario, Libro libro) {
        usuario.librosPrestados.remove(libro.getIsbn());
        System.out.println("el usuario ha devuelto el libro:" + libro.getTitulo());
    }

}
