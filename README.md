
# Refatoração do Método `registraUsuario(String)`

Este repositório contém a refatoração do método `registraUsuario(String)` de um sistema de gerenciamento de usuários, visando melhorar a legibilidade e a manutenção do código. O processo de refatoração foi realizado seguindo as práticas de *Test-Driven Development (TDD)* e as diretrizes de *Clean Code* sugeridas por Robert C. Martin e Martin Fowler.

## Objetivo da Refatoração

O objetivo principal deste projeto foi melhorar a estrutura do código do método `registraUsuario`, abordando os seguintes pontos:
- Redução do aninhamento excessivo de condições.
- Simplificação do código utilizando o padrão *Early Return*.
- Melhoria das mensagens de erro e centralização de exceções.
- Uso de estruturas de dados adequadas para garantir maior eficiência e clareza.

## Estrutura do Projeto

Este projeto contém:
- **Classe `RefatoracaoSab`**: Contém o método `registraUsuario(String)` refatorado.
- **Exceções Personalizadas**: `UsuarioJaRegistradoException`, `UsuarioComNomeVazioException`, `UsuarioInexistenteException`.
- **Testes de Unidade**: Testes para garantir o comportamento esperado do método refatorado.

## Fluxo do Método `registraUsuario`

O método `registraUsuario` realiza o seguinte fluxo:
1. Verifica se o nome fornecido é `null`. Se for, lança uma exceção `UsuarioInexistenteException`.
2. Verifica se o nome está vazio. Se for, lança uma exceção `UsuarioComNomeVazioException`.
3. Cria um novo objeto `Usuario` com o nome fornecido.
4. Verifica se o usuário já está registrado. Se estiver, lança uma exceção `UsuarioJaRegistradoException`.
5. Caso contrário, adiciona o novo usuário ao conjunto de usuários.

## Código Original

Abaixo está o código original do método `registraUsuario(String)` antes da refatoração:

```java
public void registraUsuario(String nome)
        throws UsuarioJaRegistradoException, UsuarioComNomeVazioException,
        UsuarioInexistenteException {
    if (nome != null) {
        if (!nome.isEmpty()) {
            Usuario usuario = new Usuario(nome);
            if (!_usuarios.contains(usuario)) {
                _usuarios.add(usuario);
            } else {
                throw new UsuarioJaRegistradoException("--->Já existe usuário com o nome \""
                        + nome + "\"! Use outro nome!");
            }
        } else {
            throw new UsuarioComNomeVazioException("--->Não pode registrar usuario com nome vazio!");
        }
    } else {
        throw new UsuarioInexistenteException("--->Não pode registrar usuario inexistente!");
    }
}
