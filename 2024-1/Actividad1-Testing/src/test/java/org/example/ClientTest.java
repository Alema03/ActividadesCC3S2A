package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;
import org.junit.jupiter.api.BeforeEach;

public class ClientTest {
    private
    Address addres =new Address ("street A");
    private Address secondAddress = new Address("street B");
    private Client client;


    @BeforeEach
    void setUp(){
        client =new Client();

    }
    @Test
    void afterCreationShouldHaveNoAddress(){

    }
    @Test
    void shouldAllowToAddAddress(){
        client.addAddress(addres);
    }
    @Test
    void shouldAllowToAddManyAddresses(){
        client.addAddress(addres);
        client.addAddress(secondAddress);
    }

}
