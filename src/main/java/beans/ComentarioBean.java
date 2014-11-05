package beans;

import java.util.ArrayList;
import java.util.List;

import modelo.Blog;
import modelo.Comentario;
import modelo.Postagem;

public class ComentarioBean {

	private Blog funcao;
	private int idDoPost;
	private Postagem postagem;
	private String nome;
	private String texto;
	private List<Comentario> comentario = new ArrayList<>();

	public void Comentar() {
		funcao.adicionarComentario(nome, texto, idDoPost);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public int getIdDoPost() {
		return idDoPost;
	}

	public void setIdDoPost(int idDoPost) {
		this.idDoPost = idDoPost;
	}

	public List<Comentario> getComentario() {
		return comentario;
	}

	public void setComentario(List<Comentario> comentario) {
		this.comentario = comentario;
	}

	public Postagem getPostagem() {
		return postagem;
	}

	public void setPostagem(Postagem postagem) {
		this.postagem = postagem;
	}

}
