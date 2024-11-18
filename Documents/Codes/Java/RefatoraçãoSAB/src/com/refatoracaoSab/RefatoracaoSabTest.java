package com.refatoracaoSab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RefatoracaoSabTest {

    private RefatoracaoSab refatoracaoSab;

    @BeforeEach
    void setUp() {
        refatoracaoSab = new RefatoracaoSab();
    }

    @Test
    void testRegistraUsuarioComNomeValido() throws Exception {
        assertDoesNotThrow(() -> refatoracaoSab.registraUsuario("usuarioValido"));
    }

    @Test
    void testRegistraUsuarioComNomeNulo() {
        assertThrows(UsuarioInexistenteException.class, () -> refatoracaoSab.registraUsuario(null));
    }

    @Test
    void testRegistraUsuarioComNomeVazio() {
        assertThrows(UsuarioComNomeVazioException.class, () -> refatoracaoSab.registraUsuario(""));
    }

    @Test
    void testRegistraUsuarioJaRegistrado() throws Exception {
        refatoracaoSab.registraUsuario("usuarioDuplicado");
        assertThrows(UsuarioJaRegistradoException.class, () -> refatoracaoSab.registraUsuario("usuarioDuplicado"));
    }
}