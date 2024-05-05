package org.example;
import org.junit.jupiter.api.Test;//permite la anotacion@test de la linea test de la linea 6
import static org.assertj.core.api.Assertions.assertThat;//importacion estatica del metodo asertThat de la clase aser asetrion

public class MoneyTest {//
    @Test
    void constructorShouldSetAmountAndCurrency() {//metodo de prueba

        Money money= new Money(10,"USD");//SUT


        assertThat(money.getAmount()).isEqualTo(10);//el sut se pone aa prueba y los resultados se ponen a prueba con la clase assert
        assertThat(money.getCurrency()).isEqualTo("USD");

    }

}
