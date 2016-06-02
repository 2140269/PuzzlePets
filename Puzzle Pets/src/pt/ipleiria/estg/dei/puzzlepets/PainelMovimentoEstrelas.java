package pt.ipleiria.estg.dei.puzzlepets;

import pt.ipleiria.estg.dei.gridpanel.CellRepresentation;
import pt.ipleiria.estg.dei.gridpanel.GridPanel;
import pt.ipleiria.estg.dei.gridpanel.SingleImageCellRepresentation;

public class PainelMovimentoEstrelas {
	private CellRepresentation imagem;

	public PainelMovimentoEstrelas(GridPanel gridMovimentos) {
		imagem = new SingleImageCellRepresentation("/paineis/movimentos0Estrelas.png");
		gridMovimentos.add(0,1,imagem);
		gridMovimentos.repaint();
	}

	public CellRepresentation getImagem() {
		return imagem;
	}
}
