package pt.ipleiria.estg.dei.puzzlepets.modelo;

import pt.ipleiria.estg.dei.gridpanel.CellRepresentation;
import pt.ipleiria.estg.dei.gridpanel.SingleImageCellRepresentation;

public class Animal {

	protected Painel painel;
	private Suporte suporte;
	protected Posicao posicao;
	protected CellRepresentation imagem;
	protected String nomeImagem;
	public String teste;

	public Animal(String nomeImagem) {
		super();
		this.nomeImagem = nomeImagem;
		this.imagem = new SingleImageCellRepresentation(nomeImagem);
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public CellRepresentation getImagem() {
		return imagem;
	}

	
}