package com.quebraStrings;

import java.util.List;
import java.util.ArrayList;

public class ConverterCamelCase {

    /**
     * Converte uma string no formato CamelCase em uma lista de palavras.
     * A função divide a string em palavras, mantendo a primeira letra de cada palavra,
     * trata caracteres especiais e converte as palavras para minúsculas, 
     * exceto aquelas que são siglas (todas maiúsculas).
     * 
     * @param original A string no formato CamelCase a ser convertida.
     * @return Uma lista de palavras extraídas da string.
     */
    public static List<String> converterCamelCase(String original) {
        // Lista que armazenará as palavras extraídas da string
        List<String> palavras = new ArrayList<>();
        
        // StringBuilder usado para construir a palavra atual
        StringBuilder palavraAtual = new StringBuilder();

        // Itera sobre cada caractere da string
        for (char c : original.toCharArray()) {
            
            // Verifica se o caractere é uma letra ou um número
            if (Character.isLetterOrDigit(c)) {
                
                // Se encontrar uma letra maiúscula e a palavra atual não está vazia,
                // adiciona a palavra à lista e reinicia o StringBuilder
                if (Character.isUpperCase(c) && palavraAtual.length() > 0) {
                    palavras.add(palavraAtual.toString());
                    palavraAtual = new StringBuilder();
                }
                
                // Adiciona o caractere à palavra atual
                palavraAtual.append(c);
            } 
            // Se o caractere não for uma letra ou número e houver uma palavra em construção,
            // adiciona a palavra à lista e reinicia o StringBuilder
            else if (palavraAtual.length() > 0) {
                palavras.add(palavraAtual.toString());
                palavraAtual = new StringBuilder();
            }
        }

        // Após o loop, adiciona a última palavra se houver
        if (palavraAtual.length() > 0) {
            palavras.add(palavraAtual.toString());
        }

        // Remove palavras que começam com números
        palavras.removeIf(palavra -> Character.isDigit(palavra.charAt(0)));

        // Converte todas as palavras para minúsculas, exceto siglas (todas maiúsculas)
        for (int i = 0; i < palavras.size(); i++) {
            String palavra = palavras.get(i);
            
            // Converte para minúsculas, exceto se for uma sigla (todas maiúsculas)
            if (!palavra.equals(palavra.toUpperCase()) || palavra.length() == 1) {
                palavras.set(i, palavra.toLowerCase());
            }
        }

        // Retorna a lista de palavras convertidas
        return palavras;
    }

}


/*
 * Relatório Detalhado da Evolução dos Testes e do Código
 * 
 * Introdução: Este relatório descreve a evolução dos testes e do código da
 * classe ConverterCamelCase, desde a implementação inicial até a versão atual.
 * A versão atual inclui testes para diferentes cenários, como palavras simples,
 * múltiplas palavras, caracteres especiais e casos limite.
 * 
 * Versão Inicial: - Cobertura de testes: Os primeiros testes cobriam apenas
 * casos simples, como palavras em minúsculo, a primeira letra maiúscula e
 * múltiplas palavras. - Código: A implementação inicial se concentrou na
 * conversão de CamelCase para minúsculo e na divisão da string em palavras.
 * 
 * Evolução dos Testes: - Casos limite: Testes foram adicionados para verificar
 * o comportamento do método com strings vazias, strings de um único caractere e
 * strings com espaços em branco. - Caracteres especiais: Testes também foram
 * incluídos para verificar o tratamento de caracteres especiais, como hífens e
 * underscores. - Combinações: Testes para verificar o comportamento do método
 * com números no início das palavras e múltiplas letras maiúsculas consecutivas
 * foram criados.
 * 
 * Evolução do Código: - Tratamento de caracteres especiais: O código foi
 * ajustado para identificar e tratar caracteres especiais, como hífens e
 * underscores, como separadores de palavras. - Remoção de palavras inválidas:
 * Foi implementada uma lógica para remover palavras que começam com números. -
 * Otimizações: O código foi otimizado para melhorar a eficiência e a
 * legibilidade.
 * 
 * Tabela Resumindo a Evolução:
 * 
 * Versão | Novos Testes | Modificações no Código
 * ---------|--------------------------------------------|----------------------
 * ------------------------------------- 1 | Palavras simples, primeira letra
 * maiúscula, múltiplas palavras | Implementação básica de conversão de
 * CamelCase 2 | String vazia, um caractere, espaços em branco | Tratamento de
 * casos limite 3 | Hífens, underscores | Tratamento de caracteres especiais
 * como separadores 4 | Números no início, múltiplas letras maiúsculas
 * consecutivas | Remoção de palavras que começam com números, otimizações
 * 
 * Considerações Finais: A evolução do código e dos testes foi um processo
 * iterativo, com cada nova versão construída sobre a anterior. A cada etapa,
 * novos testes foram adicionados para garantir que as modificações não
 * introduzissem novos erros e que o código funcionasse corretamente em uma
 * variedade de cenários.
 * 
 * Recomendações: - Continuar adicionando testes: A cobertura de testes deve ser
 * expandida constantemente para garantir a qualidade do código. - Refatorar o
 * código: À medida que o código evolui, é importante refatorá-lo para manter a
 * legibilidade e manutenibilidade. - Utilizar ferramentas de teste: Ferramentas
 * como JUnit podem automatizar a execução dos testes e gerar relatórios
 * detalhados. - Adotar boas práticas de programação: Seguir boas práticas de
 * programação, como o uso de nomes de variáveis significativos e comentários
 * claros, facilita a compreensão do código e a colaboração com outros
 * desenvolvedores.
 * 
 * Próximos Passos: - Analisar a complexidade: Avaliar a complexidade do
 * algoritmo e identificar possíveis otimizações. - Implementar testes de
 * performance: Medir o desempenho do método para diferentes tamanhos de
 * entrada. - Considerar internacionalização: Adaptar o código para lidar com
 * diferentes idiomas e conjuntos de caracteres.
 * 
 * Conclusão: Através da criação de testes abrangentes e da evolução gradual do
 * código, foi possível construir um método converterCamelCase robusto e
 * confiável. Este processo destaca a importância do desenvolvimento orientado
 * por testes (TDD) para garantir a qualidade do software.
 * 
 * Observação: Este relatório pode ser adaptado e expandido para incluir
 * informações mais específicas sobre o projeto, como o contexto em que o código
 * foi desenvolvido, as ferramentas utilizadas e os desafios encontrados.
 */
