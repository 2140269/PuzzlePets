package pt.ipleiria.estg.dei.puzzlepets.modelo;

import pt.ipleiria.estg.dei.gridpanel.CellRepresentation;
import pt.ipleiria.estg.dei.gridpanel.SingleImageCellRepresentation;
import pt.ipleiria.estg.dei.puzzlepets.PainelPrincipal;

public class Suporte{

	protected PainelPrincipal painel;
	protected CellRepresentation imagem;
	protected Posicao posicao;
	protected String nomeImagem;
	private Animal animal;

	public Suporte(PainelPrincipal painel, Posicao posicao, String nomeImagem) {
		super();
		this.painel = painel;
		this.posicao = posicao;
		this.nomeImagem = nomeImagem;
		this.imagem = new SingleImageCellRepresentation(nomeImagem);
	}

	public PainelPrincipal getPainel() {
		return painel;
	}
	
	public void setElemento( Animal animal){
		this.animal = animal;
	}

	public void setPainel(PainelPrincipal painel) {
		this.painel = painel;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public void setImagem(CellRepresentation imagem) {
		this.imagem = imagem;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}

	public void setNomeImagem(String nomeImagem) {
		this.nomeImagem = nomeImagem;
	}

	public CellRepresentation getImagem() {
		return imagem;
	}

	public void atualizar() {
		if (this instanceof SuporteAr) {
			nomeImagem = "/suportes/ar.png";
		}
		if (this instanceof SuporteAgua) {
			nomeImagem = "/suportes/agua.png";
		}
		if (this instanceof SuporteGelo) {
			nomeImagem = "/suportes/gelo.png";
		}

	}

	public CellRepresentation getNomeImagem() {
		return imagem;
	}

	public Posicao getPosicao() {
		return posicao;
	}


}