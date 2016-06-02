package pt.ipleiria.estg.dei.puzzlepets.modelo;

import pt.ipleiria.estg.dei.gridpanel.CellRepresentation;


@SuppressWarnings ("unused")
public class Bloco implements Celula{
	
	private CellRepresentation imagem;
	private Posicao posicao;
	//animais

	public CellRepresentation getCellRepresentation() {
		
		// TODO Auto-generated method stub
		return imagem;
	}

	public Posicao getPosicao() {
		// TODO Auto-generated method stub
		return null;
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
