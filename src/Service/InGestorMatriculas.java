package Service;

import Model.Alumno;
import Model.Asignatura;
import Model.Profesor;

/**
 * Interfaz que tiene las operaciones para la gestión de las matrículas
 */
public interface InGestorMatriculas {
    /**
     * Crea una matricula
     * @param alumno
     * @param asignatura
     * @param profesor
     * @param nota
     */
    void crearMatricula(Alumno alumno, Asignatura asignatura, Profesor profesor, double nota);

    /**
     * Calcula y devuelve la nota media global
     */
    double mediaGlobal();

    void mostrarTodas();

    void mostrarAprobados();

    void subirNotaTodos(double puntos);
}

