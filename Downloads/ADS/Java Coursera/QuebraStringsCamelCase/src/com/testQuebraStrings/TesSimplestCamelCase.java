package com.testQuebraStrings;

import org.junit.jupiter.api.Test;
import com.quebraStrings.ConverterCamelCase;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Arrays;

public class TesSimplestCamelCase {

    /**
     * Testa a conversão de uma palavra simples em minúscula.
     */
    @Test
    public void testPalavraMinuscula() {
        // Chama o método para converter CamelCase e compara com o resultado esperado
        List<String> resultado = ConverterCamelCase.converterCamelCase("nome");
        List<String> esperado = Arrays.asList("nome");
        assertEquals(esperado, resultado);
    }

    /**
     * Testa a conversão de uma palavra com a primeira letra maiúscula.
     * A palavra deve ser convertida para minúscula.
     */
    @Test
    public void testPrimeiraLetraMaiuscula() {
        // Chama o método para converter CamelCase e compara com o resultado esperado
        List<String> resultado = ConverterCamelCase.converterCamelCase("Nome");
        List<String> esperado = Arrays.asList("nome");
        assertEquals(esperado, resultado);
    }

    /**
     * Testa a conversão de uma string CamelCase com múltiplas palavras.
     * O método deve separar as palavras corretamente.
     */
    @Test
    public void testMultiplasPalavras() {
        // Chama o método para converter CamelCase e compara com o resultado esperado
        List<String> resultado = ConverterCamelCase.converterCamelCase("nomeSobrenome");
        List<String> esperado = Arrays.asList("nome", "sobrenome");
        assertEquals(esperado, resultado);
    }

    /**
     * Testa a conversão de uma string vazia.
     * O resultado esperado é uma lista vazia.
     */
    @Test
    public void testStringVazia() {
        // Chama o método para converter CamelCase e compara com o resultado esperado
        List<String> resultado = ConverterCamelCase.converterCamelCase("");
        List<String> esperado = Arrays.asList();
        assertEquals(esperado, resultado);
    }

    /**
     * Testa a conversão de uma string com apenas um caractere.
     * O resultado esperado é o caractere convertido para minúscula.
     */
    @Test
    public void testUmCaractere() {
        // Chama o método para converter CamelCase e compara com o resultado esperado
        List<String> resultado = ConverterCamelCase.converterCamelCase("A");
        List<String> esperado = Arrays.asList("a");
        assertEquals(esperado, resultado);
    }

    /**
     * Testa a conversão de uma string contendo apenas espaços em branco.
     * O resultado esperado é uma lista vazia.
     */
    @Test
    public void testEspacosEmBranco() {
        // Chama o método para converter CamelCase e compara com o resultado esperado
        List<String> resultado = ConverterCamelCase.converterCamelCase("   ");
        List<String> esperado = Arrays.asList();
        assertEquals(esperado, resultado);
    }

    /**
     * Testa a conversão de uma string contendo um hífen como separador.
     * O hífen deve ser tratado como um separador de palavras.
     */
    @Test
    public void testHifen() {
        // Chama o método para converter CamelCase e compara com o resultado esperado
        List<String> resultado = ConverterCamelCase.converterCamelCase("nome-composto");
        List<String> esperado = Arrays.asList("nome", "composto");
        assertEquals(esperado, resultado);
    }
}
