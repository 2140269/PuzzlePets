package pt.ipleiria.estg.dei.puzzlepets.modelo;

import pt.ipleiria.estg.dei.gridpanel.SingleImageCellRepresentation;


public class Peixe extends Animal {

	public Peixe(Painel painel, Posicao posicao) {
		super("/animais/peixe.png");
		this.painel = painel;
		this.posicao = posicao;
		imagem =  new SingleImageCellRepresentation("/animais/peixe.png");
		}

}
