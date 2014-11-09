package modelo;

import java.util.List;

import persistencia.UsuarioDAO;

public class GerenciadorDeUsuarios {
	
	private UsuarioDAO dao = new UsuarioDAO();
		
	public void cadastrarUsuario(Usuario usuario) {
		dao.create(usuario);
	}

	public Usuario logar(Usuario usuario) {
		dao.buscaPorLoginESenha(usuario);
		return usuario;
	}

	public List<Usuario> listaDeUsuarios() {

		List<Usuario> usuarios = dao.findAll();
		return usuarios;
	}
	
}
