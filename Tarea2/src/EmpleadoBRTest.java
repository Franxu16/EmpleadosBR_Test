import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class EmpleadoBRTest {
    //Primer commit de la práctica
    @Test
    void testCalculaSalarioBruto1(){
        double resultadoReal = EmpleadoBR.calcularSalarioBruto(
                TipoEmpleado.vendedor, 2000.0f, 8.0f);
        double resultadoEsperado = 1360.0f;
        assertEquals(resultadoEsperado, resultadoReal, 0.01);

    }

    @Test
    void testCalcularSalarioNeto1(){
        assertEquals(1640, EmpleadoBR.calcularSalarioNeto(2000));
    }

    @Test
    void testCalcularSalarioNeto2(){
        assertEquals(1230, EmpleadoBR.calcularSalarioNeto(1500));
    }
    @Test
    void testCalcularSalarioNeto3(){
        assertEquals(1259.9916f, EmpleadoBR.calcularSalarioNeto(1499.99f), 0.01);
    }

    @Test
    void testCalcularSalarioNeto4(){
        assertEquals(1050, EmpleadoBR.calcularSalarioNeto(1250));
    }

    @Test
    void testCalcularSalarioNeto5(){
        assertEquals(840, EmpleadoBR.calcularSalarioNeto(1000), 0.06);
    }
    //Segundo commit de la práctica
    @Test
    void testCalcularSalarioNeto6(){
        assertEquals(999.99f, EmpleadoBR.calcularSalarioNeto(999.99f));
    }

    @Test
    void calcularSalarioNeto7(){
        assertEquals(500, EmpleadoBR.calcularSalarioNeto(500));
    }

    @Test
    void testCalcularSalarioNeto8(){
        assertEquals(0, EmpleadoBR.calcularSalarioNeto(0));
    }

    @Test
    void testCalcularSalarioNesto9(){
        assertEquals(-1, EmpleadoBR.calcularSalarioNeto(-1));
    }

    //Tercer commit de la práctica
    @Test
    void testCalcularSalarioBruto1(){
        assertEquals(1360.0f, EmpleadoBR.calcularSalarioBruto(TipoEmpleado.vendedor, 2000.0f, 8.0f));
    }

    @Test
    void testCalcularSalarioBruto2(){
        assertEquals(1260.0f, EmpleadoBR.calcularSalarioBruto(TipoEmpleado.vendedor, 1500.0f, 3.0f));
    }

    @Test
    void testCalcularSalarioBruto3(){
        assertEquals(1100.0f, EmpleadoBR.calcularSalarioBruto(TipoEmpleado.vendedor, 1499.99f, 0.0f));
    }

    @Test
    void testCalcularSalarioBruto4(){
        assertEquals(1760.0f, EmpleadoBR.calcularSalarioBruto(TipoEmpleado.encargado, 1250.0f, 8.0f));
    }

    @Test
    void testCalcularSalarioBruto5(){
        assertEquals(1600.0f, EmpleadoBR.calcularSalarioBruto(TipoEmpleado.encargado, 1000.0, 0.0f));
    }
}
