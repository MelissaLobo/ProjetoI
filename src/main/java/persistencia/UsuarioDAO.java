package persistencia;

import javax.persistence.Query;

import modelo.Usuario;


public class UsuarioDAO extends DaoGenerico<Usuario, Integer>{

		
	public Usuario buscaPorLoginESenha(Usuario usuario) {

		try {
			Query query = entityManager
					.createQuery("from Usuario usuario where usuario.email = :email AND usuario.senha = :senha");
			query.setParameter("email", usuario.getEmail());
			query.setParameter("senha", usuario.getSenha());

			if (!query.getResultList().isEmpty()) {
				return (Usuario) query.getResultList().get(0);
			}

			return null;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuario;
	}
}
