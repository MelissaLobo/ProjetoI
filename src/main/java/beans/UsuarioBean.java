package beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;

import modelo.GerenciadorDeUsuarios;
import modelo.Postagem;
import modelo.Usuario;
import util.JpaUseful;

@ManagedBean
public class UsuarioBean {

	private GerenciadorDeUsuarios funcao = new GerenciadorDeUsuarios();
	private Usuario usuario;
	private String nome;
	private String email;
	private String senha;
		
	public UsuarioBean(){
	}
	
	public String cadastro(){
		Usuario user = new Usuario(nome, email, senha);
		funcao.cadastrarUsuario(user);	
		return "/login";
	}
	
	public String logar(){
		funcao.logar(usuario);
		 return "/home";
	}
	public String deslogar(){
		return "/login";
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
