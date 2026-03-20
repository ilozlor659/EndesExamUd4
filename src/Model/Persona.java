package Model;

/**
 * Clase padre
 */
public abstract class Persona {
    private String nombre;

    /**
     *
     * @param nombre
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Sirve para mostrar detalles
     */
    public abstract void mostrarDetalles();
}
