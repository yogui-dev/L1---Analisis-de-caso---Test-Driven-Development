package org.example;

import java.util.List;

public class CursoService {

    public double calcularPromedio(List<Double> notas) {
        double sum = 0.0;
        for (Double n : notas) sum += n;
        return sum / notas.size();
    }
}
