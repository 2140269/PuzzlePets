package pt.ipleiria.estg.dei.puzzlepets;

import pt.ipleiria.estg.dei.gridpanel.CellRepresentation;
import pt.ipleiria.estg.dei.gridpanel.GridPanel;
import pt.ipleiria.estg.dei.gridpanel.SingleImageCellRepresentation;

public class PainelPontuacao {
	private CellRepresentation imagem;

	public PainelPontuacao(GridPanel gridPontuacao) {
		
		
		imagem =  new SingleImageCellRepresentation("/paineis/pontuacao.png");
		gridPontuacao.add(0,1,imagem);
		gridPontuacao.repaint();
	}

	public CellRepresentation getImagem() {
		return imagem;
	}
}
