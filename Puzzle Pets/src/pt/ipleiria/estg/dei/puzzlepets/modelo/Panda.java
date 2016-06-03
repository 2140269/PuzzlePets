package pt.ipleiria.estg.dei.puzzlepets.modelo;

import pt.ipleiria.estg.dei.gridpanel.SingleImageCellRepresentation;


public class Panda extends Animal{

	public Panda(Painel painel, Posicao posicao) {
		super(posicao, "/animais/panda.png");
		this.painel = painel;
		this.posicao = posicao;
		imagem =  new SingleImageCellRepresentation("/animais/panda.png");
		}
}
