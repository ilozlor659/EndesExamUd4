package Model;

public class Profesor extends Persona{

    private String especialidad;

    public Profesor(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Model.Profesor: " + getNombre() + " - " + getEspecialidad());
    }
}
