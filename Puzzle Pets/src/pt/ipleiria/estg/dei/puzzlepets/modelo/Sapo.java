package pt.ipleiria.estg.dei.puzzlepets.modelo;

import pt.ipleiria.estg.dei.gridpanel.SingleImageCellRepresentation;


public class Sapo extends Animal {

	public Sapo(Painel painel, Posicao posicao) {
		super(posicao, "/animais/sapo.png");
		this.painel = painel;
		this.posicao = posicao;
		imagem =  new SingleImageCellRepresentation("/animais/sapo.png");
		}
}
 