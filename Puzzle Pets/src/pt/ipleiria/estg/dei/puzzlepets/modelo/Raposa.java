package pt.ipleiria.estg.dei.puzzlepets.modelo;

import pt.ipleiria.estg.dei.gridpanel.SingleImageCellRepresentation;


public class Raposa extends Animal {

	public Raposa(Painel painel, Posicao posicao) {
		super(posicao, "/animais/raposa.png");
		this.painel = painel;
		this.posicao = posicao;
		imagem =  new SingleImageCellRepresentation("/animais/raposa.png");
		}
}
