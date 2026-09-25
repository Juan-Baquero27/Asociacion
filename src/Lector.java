public class Lector {

    private String nombre;
    private String cedula;
    private Libro libroActual;

    public Lector() {
    }

    public Lector(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public Libro getLibroActual() {
        return libroActual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void tomarPrestado(Libro libro) {
        if (libroActual != null) {
            System.out.println(nombre + " ya tiene el libro \"" + libroActual.getTitulo() + "\". Debe devolverlo primero.");
        } else {
            if (libro.prestar()) {
                libroActual = libro;
            }
        }
    }

    public void regresarLibro() {
        if (libroActual == null) {
            System.out.println(nombre + " no tiene ningún libro.");
        } else {
            libroActual.devolver();
            libroActual = null;
        }
    }

    public void mostrarEstado() {
    String estado = (libroActual != null) ? libroActual.getTitulo(): "Sin libro";
    System.out.println("Lector: " + nombre + " | Libro: " + estado);
    }
    
}
