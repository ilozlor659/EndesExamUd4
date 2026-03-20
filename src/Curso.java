import java.util.ArrayList;

public class Curso {

    private String nombre;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Asignatura> asignaturas;
    private ArrayList<Profesor> profesores;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
        this.asignaturas = new ArrayList<>();
        this.profesores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarAlumno(Alumno a) {
        alumnos.add(a);
    }

    public void agregarAsignatura(Asignatura a) {
        asignaturas.add(a);
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void mostrarTodo() {
        System.out.println("CURSO: " + nombre);

        for (Alumno a : alumnos) {
            System.out.println("Alumno: " + a.getNombre());
        }

        for (Asignatura as : asignaturas) {
            System.out.println("Asignatura: " + as.getNombre());
        }

        for (Profesor p : profesores) {
            System.out.println("Profesor: " + p.getNombre());
        }
    }
}
