package pt.ipleiria.estg.dei.puzzlepets.modelo;
import pt.ipleiria.estg.dei.gridpanel.CellRepresentation;
import pt.ipleiria.estg.dei.gridpanel.GridPanel;
import pt.ipleiria.estg.dei.puzzlepets.PainelPrincipal;


@SuppressWarnings("unused")

public class Painel extends PainelPrincipal{
	private Parede[][] grelha;
	private CellRepresentation imagem;
	
	public Painel(GridPanel gridPanel, CellRepresentation imagem) {
		super(gridPanel);
		this.imagem = imagem;
	}

	public void iterar(long currentTimeMillis) {	
	}
	
	public void adicionarParede(Parede parede)
	{
		grelha[parede.getPosicao().getLinha()][parede.getPosicao().getColuna()] = parede;
		
	}
}
