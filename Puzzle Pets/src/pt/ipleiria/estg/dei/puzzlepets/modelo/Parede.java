package pt.ipleiria.estg.dei.puzzlepets.modelo;

import pt.ipleiria.estg.dei.gridpanel.CellRepresentation;
import pt.ipleiria.estg.dei.gridpanel.SingleImageCellRepresentation;

@SuppressWarnings("unused")
public class Parede {

private Painel painel;
private Posicao posicao;
private CellRepresentation imagem;
	
	public Parede(Painel painel, Posicao posicao) {
		super();
		this.painel = painel;
		this.posicao = posicao;
		imagem = new SingleImageCellRepresentation("/parede/parede.png");
	}
	
	public Posicao getPosicao() {
		return posicao;
	}

	public CellRepresentation getCellRepresentation() {
		return imagem;
	}

	public boolean temElementoMovel() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean podeMover() {
		// TODO Auto-generated method stub
		return false;
	}

}
