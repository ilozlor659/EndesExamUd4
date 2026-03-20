package Service;

import Model.Alumno;
import Model.Asignatura;
import Model.Matricula;
import Model.Profesor;

import java.util.ArrayList;

/**
 * Sirve para gestionar la lógica del colegio, calculos, etc.
 */
public class GestorMatriculas implements InGestorMatriculas{

    private ArrayList<Matricula> matriculas;

    public GestorMatriculas() {
        matriculas = new ArrayList<>();
    }

    /**
     * Sirve para crear matriculas
     * @param alumno
     * @param asignatura
     * @param profesor
     * @param nota
     */
    public void crearMatricula(Alumno alumno, Asignatura asignatura, Profesor profesor, double nota) {

        if (nota < 0) {
            nota = 0;
        }

        Matricula m = new Matricula(alumno, asignatura, profesor, nota);

        matriculas.add(m);

        alumno.matricular(m);
    }

    /**
     * Sirve para mostrar todas las matriculas
     */
    public void mostrarTodas() {
        for (Matricula m : matriculas) {
            System.out.println(
                m.getAlumno().getNombre() + " - " +
                m.getAsignatura().getNombre() + " - " +
                m.getProfesor().getNombre() + " - " +
                m.getNota()
            );
        }
    }

    /**
     * Sirve para mostrar todos los alumnos aprobados
     */
    public void mostrarAprobados() {
        for (Matricula m : matriculas) {
            if (m.getNota() >= 5) {
                System.out.println("APROBADO: " + m.getAlumno().getNombre());
            }
        }
    }

    /**
     * Sirve para subir la nota de todos los alumnos
     * @param puntos
     */
    public void subirNotaTodos(double puntos) {
        for (Matricula m : matriculas) {
            m.setNota(m.getNota() + puntos);

            if (m.getNota() > 10) {
                m.setNota(10);
            }
        }
    }

    /**
     * Calcula la media global
     * @return
     */
    public double mediaGlobal() {
        double suma = 0;

        for (Matricula m : matriculas) {
            suma += m.getNota();
        }

        if (matriculas.size() == 0) return 0;

        return suma / matriculas.size();
    }
}
