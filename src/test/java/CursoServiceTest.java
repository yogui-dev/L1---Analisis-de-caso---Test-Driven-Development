import org.example.CursoService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CursoServiceTest {


    @Test
    void calcularPromedio_retornaPromedioDeNotas() {
        CursoService service = new CursoService();
        List<Double> notas = Arrays.asList(5.0, 6.0, 7.0);

        double promedio = service.calcularPromedio(notas);

        assertEquals(6.0, promedio, 0.0001, "Debe promediar correctamente");
    }
}
