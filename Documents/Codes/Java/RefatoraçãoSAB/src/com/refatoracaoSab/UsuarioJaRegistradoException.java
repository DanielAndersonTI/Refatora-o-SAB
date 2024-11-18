package com.refatoracaoSab;


public class UsuarioJaRegistradoException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UsuarioJaRegistradoException() {
        super("Usuário já registrado.");
    }
}