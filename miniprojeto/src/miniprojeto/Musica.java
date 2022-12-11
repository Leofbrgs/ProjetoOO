package miniprojeto;

public class Musica {
	private String artista;
	private String letra;
	private String nome;
	
	public Musica() {
	}
	
	public Musica(String artista, String nome, String letra) {
		this.artista = artista;
		this.letra = letra;
		this.nome = nome;
		
	}
	
	@Override
	public String toString() {
		return "\n\nMusica\nArtista= " + artista + "\nLetra= " + letra + "\nNome= " + nome + "";
	}

	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
