package persistencia;

import java.util.List;

import javax.persistence.Query;

import modelo.Postagem;
import modelo.Usuario;

public class PostagemDAO extends DaoGenerico<Postagem, Long>{

	@SuppressWarnings("unchecked")
	public List<Postagem> listaPostsPorUsuario(Usuario usuario) {
		
		try {
			Query query = entityManager.createQuery("from Postagem postagem");
		//	query.setParameter("usuario", usuario);
			return query.getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
