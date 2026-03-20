public class Matricula {

    private Alumno alumno;
    private Asignatura asignatura;
    private Profesor profesor;
    private double nota;

    public Alumno getAlumno() {
        return alumno;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Matricula(Alumno alumno, Asignatura asignatura, Profesor profesor, double nota) {
        this.alumno = alumno;
        this.asignatura = asignatura;
        this.profesor = profesor;
        this.nota = nota;
    }

    public void mostrar() {
        System.out.println(alumno.getNombre() + " - " +
                asignatura.getNombre() + " - " +
                profesor.getNombre() + " - Nota: " + nota);
    }
}
