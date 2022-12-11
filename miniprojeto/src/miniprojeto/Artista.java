package miniprojeto;

import java.util.ArrayList;

public class Artista {
	private String nomeartistico;
	private String genero;
	private ArrayList <Musica> musicas;
	
	public Artista() {
		musicas = new ArrayList<Musica>();
	}
	
	public Artista(String nomeartistico, String genero) {
		this.nomeartistico = nomeartistico;
		this.genero = genero;
		musicas = new ArrayList<Musica>();
	}
	
	@Override
	public String toString() {
		return "Artista \nNome artistico= " + nomeartistico + "\nGenero= " + genero + " \nMusicas= " + musicas + "";
	}

	public String getNomeartistico() {
		return nomeartistico;
	}
	public void setNomeartistico(String nomeartistico) {
		this.nomeartistico = nomeartistico;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public ArrayList<Musica> getMusicas() {
		return musicas;
	}
	public void setMusicas(ArrayList<Musica> musicas) {
		this.musicas = musicas;
	}
	






}
