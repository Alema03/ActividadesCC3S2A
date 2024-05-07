import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadorTest {

    @Test
    public void sumaDosNumeros() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 5;
        int numeroB = 3;

        // Act
        int resultado = calculador.sumar(numeroA, numeroB);

        // Assert
        assertEquals(8, resultado);
    }

    @Test
    public void restaDosNumeros() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 4;

        // Act
        int resultado = calculador.restar(numeroA, numeroB);

        // Assert
        assertEquals(6, resultado);
    }

    @Test
    public void multiplicacionDosNumeros() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 6;
        int numeroB = 7;

        // Act
        int resultado = calculador.multiplicacion(numeroA, numeroB);

        // Assert
        assertEquals(42, resultado);
    }

    @Test
    public void divisionDosNumeros() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 2;

        // Act
        double resultado = calculador.division(numeroA, numeroB);

        // Assert
        assertEquals(5.0, resultado);
    }

    @Test
    public void divisionPorCeroLanzaExcepcion() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 10;
        int numeroB = 0;

        // Act & Assert
        assertThrows(ArithmeticException.class, () -> {
            calculador.division(numeroA, numeroB);
        });
    }

    @Test
    public void restaConResultadoNegativo() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 4;
        int numeroB = 10;

        // Act
        int resultado = calculador.restar(numeroA, numeroB);

        // Assert
        assertEquals(-6, resultado);
    }


    @Test
    public void multiplicacionConNumeroNegativo() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 6;
        int numeroB = -7;

        // Act
        int resultado = calculador.multiplicacion(numeroA, numeroB);

        // Assert
        assertEquals(-42, resultado);
    }


    @Test
    public void divisionConResultadoFraccionario() {
        // Arrange
        Calculador calculador = new Calculador();
        int numeroA = 5;
        int numeroB = 2;

        // Act
        double resultado = calculador.division(numeroA, numeroB);

        // Assert
        assertEquals(2.5, resultado);
    }
}
