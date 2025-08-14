package org.example;

import java.util.List;
import java.util.Objects;

public class CursoService {

    public double calcularPromedio(List<Double> notas) {
        Objects.requireNonNull(notas, "La lista de notas no puede ser nula");
        if (notas.isEmpty()) {
            throw new IllegalArgumentException("No se puede calcular promedio sin estudiantes");
        }
        return notas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElseThrow();
    }

    public boolean verificarCupos(int capacidad, int inscritos) {
        if (capacidad < 0 || inscritos < 0) {
            throw new IllegalArgumentException("Capacidad e inscritos deben ser >= 0");
        }
        if (inscritos > capacidad) return false;
        return inscritos < capacidad;
    }

}
