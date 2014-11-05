package persistencia;

import java.util.List;

import javax.persistence.Query;

import modelo.Comentario;
import modelo.Postagem;

public class ComentarioDAO extends DaoGenerico<Comentario, Long> {

	@SuppressWarnings("unchecked")
	public List<Comentario> listaComentarioPorPost(Postagem postagem) {

		try {
			Query query = entityManager.createQuery("from Comentario comentario");
		//	query.setParameter("postagem", postagem);
			return query.getResultList();

		} catch (Exception e) {
		   e.printStackTrace();
		}
		return null;
	}

}
