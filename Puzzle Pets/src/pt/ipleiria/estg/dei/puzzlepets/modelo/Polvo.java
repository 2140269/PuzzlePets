package pt.ipleiria.estg.dei.puzzlepets.modelo;

import pt.ipleiria.estg.dei.gridpanel.SingleImageCellRepresentation;


public class Polvo extends Animal {

	public Polvo(Painel painel, Posicao posicao) {
		super(posicao,  "/animais/polvo.png");
		this.painel = painel;
		this.posicao = posicao;
		imagem =  new SingleImageCellRepresentation("/animais/polvo.png");
		}
}
