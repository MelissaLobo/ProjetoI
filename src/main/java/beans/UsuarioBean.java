package beans;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;

import modelo.GerenciadorDeUsuarios;
import modelo.Usuario;
import util.JpaUseful;

@ManagedBean
public class UsuarioBean {

	private GerenciadorDeUsuarios funcao;
	private Usuario usuario;
	private String nome;
	private String email;
	private String senha;
	
	public UsuarioBean(){}
	
	public void cadastrar(){
		EntityManager entityManager = JpaUseful.getEntityManager(); 
		entityManager.getTransaction().begin();
		Usuario user = new Usuario(nome, email, senha);
		entityManager.persist(user);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
	
	public String cadastro(){
		Usuario user = new Usuario(nome, email, senha);
		funcao.cadastrarUsuario(user);
		return "pretty:login";
	}
	
	public String logar(Usuario usuario){
		funcao.logar(usuario);
		 return "pretty:home";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
