package pt.ipleiria.estg.dei.puzzlepets.modelo;


import pt.ipleiria.estg.dei.gridpanel.CellRepresentation;

public interface Celula {
	
	public abstract CellRepresentation getCellRepresentation();

	public abstract Posicao getPosicao();

	public abstract boolean temElementoMovel();
	
	public abstract boolean podeMover();

}
