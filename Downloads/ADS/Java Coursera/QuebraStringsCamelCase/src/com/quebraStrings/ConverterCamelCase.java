package com.quebraStrings;

import java.util.List;
import java.util.ArrayList;

public class ConverterCamelCase {
    
    // Método estático que recebe uma string 'original' como parâmetro.
    // O objetivo do método é converter a string para minúsculas e armazená-la em uma lista.
    public static List<String> converterCamelCase(String original) {
        
        // Criação de uma lista para armazenar os resultados.
        List<String> resultado = new ArrayList<>();
        
        // Adiciona a versão da string 'original' convertida para minúsculas na lista 'resultado'.
        resultado.add(original.toLowerCase());
        
        // Retorna a lista contendo a string convertida para minúsculas.
        return resultado;
    }
}








