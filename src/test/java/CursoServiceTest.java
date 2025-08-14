import org.example.CursoService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class CursoServiceTest {


    @Test
    void calcularPromedio_retornaPromedioDeNotas() {
        CursoService service = new CursoService();
        List<Double> notas = Arrays.asList(5.0, 6.0, 7.0);

        double promedio = service.calcularPromedio(notas);

        assertEquals(6.0, promedio, 0.0001, "Debe promediar correctamente");
    }

    @Test
    void verificarCupos_devuelveFalseSiNoHayEspacio() {
        CursoService service = new CursoService();
        assertFalse(service.verificarCupos(30, 30));
    }

    // CursoServiceTest.java
    @Test
    void calcularPromedio_lanzaExcepcionSiListaVacia() {
        CursoService service = new CursoService();
        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> service.calcularPromedio(List.of())
        );
        assertTrue(ex.getMessage().contains("promedio"));
    }

    @Test
    void calcularPromedio_lanzaNPESiListaNula() {
        CursoService service = new CursoService();
        assertThrows(NullPointerException.class, () -> service.calcularPromedio(null));
    }

    @Test
    void verificarCupos_lanzaExcepcionSiParametrosNegativos() {
        CursoService service = new CursoService();
        assertThrows(IllegalArgumentException.class, () -> service.verificarCupos(-1, 0));
        assertThrows(IllegalArgumentException.class, () -> service.verificarCupos(10, -5));
    }
}
