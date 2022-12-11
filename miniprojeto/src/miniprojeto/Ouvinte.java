package miniprojeto;

public class Ouvinte {
	private String usuario;
	private String generofavorito;
	
	@Override
	public String toString() {
		return "\nOuvinte\nUsuario= " + usuario + "\nGenero favorito= " + generofavorito + "]";
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getGenerofavorito() {
		return generofavorito;
	}
	public void setGenerofavorito(String generofavorito) {
		this.generofavorito = generofavorito;
	}
	
	

}
