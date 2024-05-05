package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.assertThat;
public class MoneyManyParamsAnnotationTest {
    @ParameterizedTest
    @CsvSource({
            "10,USD",
            "10,EUR",
            "50,CHF",

    })
    void constructorShouldAmountAndCurrency(int amount,String currency){
        Money money = new Money(amount, currency);
        assertThat(money.getAmount()).isEqualTo(amount);
        assertThat(money.getCurrency()).isEqualTo(currency);


    }


}
