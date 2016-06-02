package pt.ipleiria.estg.dei.puzzlepets;

import pt.ipleiria.estg.dei.gridpanel.CellRepresentation;
import pt.ipleiria.estg.dei.gridpanel.GridPanel;
import pt.ipleiria.estg.dei.gridpanel.SingleImageCellRepresentation;

public class PainelMacas {
	private CellRepresentation imagem;
	public PainelMacas(GridPanel gridMacas) {
		imagem = new SingleImageCellRepresentation("/paineis/macas.png");
		gridMacas.add(0,1,imagem);
		gridMacas.repaint();
		
	}

}
