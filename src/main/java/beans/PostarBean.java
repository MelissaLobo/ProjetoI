package beans;

import java.util.List;

import javax.faces.bean.ManagedBean;

import modelo.Blog;
import modelo.Postagem;
import modelo.Usuario;

@ManagedBean
public class PostarBean {
	
	private Blog funcao;
	private String titulo="egg";
	private String texto;
	private Postagem postagem = new Postagem();
	private List<Postagem> postagens;
	
	public PostarBean() {
	}
	
	public PostarBean(Blog funcao) {
		this.funcao = funcao;
	}
	
	public String salvarPost(Usuario usuario){
		funcao.adicionarPostagem(titulo, texto, usuario);
		 return "pretty:home";
	}
	
	public String deletar(){
		funcao.deletarPostagem(postagem);
		return "pretty:home";
	}
	public List<Postagem> getPostagens() {
		return postagens;
	}

	public void setPostagens(List<Postagem> postagens) {
		this.postagens = postagens;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Postagem getPostagem() {
		return postagem;
	}

	public void setPostagem(Postagem postagem) {
		this.postagem = postagem;
	}
	
	
	
}
