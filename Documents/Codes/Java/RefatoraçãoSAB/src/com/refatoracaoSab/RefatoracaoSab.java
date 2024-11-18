package com.refatoracaoSab;

import java.util.HashSet;
import java.util.Set;

public class RefatoracaoSab {

	private Set<Usuario> _usuarios = new HashSet<>();

	// Registra um usuário no sistema
	public void registraUsuario(String nome)
			throws UsuarioJaRegistradoException, UsuarioComNomeVazioException, UsuarioInexistenteException {

		if (nome == null) {
			throw new UsuarioInexistenteException(); // Verifica se o nome é nulo
		}

		if (nome.isEmpty()) {
			throw new UsuarioComNomeVazioException(); // Verifica se o nome é vazio
		}

		Usuario usuario = new Usuario(nome);

		if (_usuarios.contains(usuario)) {
			throw new UsuarioJaRegistradoException(); // Verifica se o usuário já está registrado
		}

		_usuarios.add(usuario); // Adiciona o usuário ao conjunto
	}
}