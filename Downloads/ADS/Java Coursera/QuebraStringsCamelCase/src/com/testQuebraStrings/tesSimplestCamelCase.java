package com.testQuebraStrings;

import org.junit.jupiter.api.Test;

import com.quebraStrings.ConverterCamelCase;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Arrays;

public class tesSimplestCamelCase {

    @Test
    public void testSimplesCamelCase() {
        // Chama o método da classe ConverterCamelCase
        List<String> resultado = ConverterCamelCase.converterCamelCase("nome");

        // Define o resultado esperado
        List<String> esperado = Arrays.asList("nome");

        // Compara o resultado obtido com o esperado
        assertEquals(esperado, resultado);
    }
}






