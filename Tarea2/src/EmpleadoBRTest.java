import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
