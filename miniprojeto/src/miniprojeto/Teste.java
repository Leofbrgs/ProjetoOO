package miniprojeto;

import java.util.ArrayList;

public class Teste {
	static Ouvinte o;

	public static void main(String[] args) {
		
		ArrayList<Artista> artistas = new ArrayList<Artista>();
		Artista artista;
		Musica musica;
		
		 
		artista = new Artista("Tim maia", "MPB");
	
		musica = new Musica("Tim maia", "Primavera", "PRIMAVERAA");
		artista.getMusicas().add(musica);
		
		musica = new Musica("Tim maia", "Nao quero dinheiro", "So quero amar");
		artista.getMusicas().add(musica);
		
		artistas.add(artista);
		
		o = new Ouvinte();
		o.setUsuario("LeoB");
		o.setGenerofavorito("Reggae");
		
		//mostrar dados
		
		System.out.println(artista.toString());
		System.out.println(o.toString());
		
	}

}