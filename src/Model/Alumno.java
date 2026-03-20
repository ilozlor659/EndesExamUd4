package Model;

import java.util.ArrayList;

/**
 * Hereda de persona y gestiona su lista de matrículas
 */
public class Alumno extends Persona {

    private int edad;
    private ArrayList<Matricula> matriculas;

    /**
     *
     * @param nombre
     * @param edad
     */
    public Alumno(String nombre, int edad) {
        super(nombre);
        this.edad = edad;
        this.matriculas = new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * @return
     */
    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    /**
     *
     * @param matriculas
     */
    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    /**
     * Sirve para añadir una matriculación
     * @param m
     */
    public void matricular(Matricula m) {
        matriculas.add(m);
    }

    /**
     * Sobrescribe el método de Persona y sirve para mostar datos especificos
     */
    @Override
    public void mostrarDetalles() {
        System.out.println("Model.Alumno: " + getNombre());

        for (Matricula m : matriculas) {
            System.out.println("Model.Asignatura: " + m.getAsignatura().getNombre() +
                    " Model.Profesor: " + m.getProfesor().getNombre() +
                    " Nota: " + m.getNota());
        }
    }

    public double calcularMedia() {
        double suma = 0;

        for (Matricula m : matriculas) {
            suma += m.getNota();
        }

        if (matriculas.size() == 0) return 0;

        return suma / matriculas.size();
    }
}
