package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
// Importa el método assertThat estático de la clase AssertionsForClassTypes de AssertJ
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// Declara la clase de la prueba
public class MoneyOneParamAnnotationTest {

    // Anotación que indica que el método es una prueba parametrizada
    @ParameterizedTest
    // Anotación que proporciona los valores para la prueba parametrizada
    @ValueSource(ints ={ 10,15,50})
    // Método de prueba que toma un parámetro 'amount'
    void constructorShouldSetAmountAndCurrency(int amount){
        // Crea una instancia de Money con el 'amount' proporcionado y la divisa "USB"
        Money money = new Money(amount, "USB");
        // Verifica si el método getAmount() de la instancia Money devuelve el 'amount' esperado
        assertThat(money.getAmount()).isEqualTo(amount);
    }
}
