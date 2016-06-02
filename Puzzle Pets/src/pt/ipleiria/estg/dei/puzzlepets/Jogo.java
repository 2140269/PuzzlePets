package pt.ipleiria.estg.dei.puzzlepets;

import pt.ipleiria.estg.dei.gridpanel.GridPanel;

@SuppressWarnings ("unused")
public class Jogo {
	
	private PainelPrincipal painelPrincipal;
	private PainelMacas painelMacas;
	private PainelMovimentoEstrelas painelMovimentosEstrelas;
	private PainelPontuacao painelPontuacao;

	public Jogo(GridPanel gridMacas, GridPanel gridMovimentos, GridPanel gridPrincipal, GridPanel gridPontuacao) {
		painelPrincipal = new PainelPrincipal(gridPrincipal);
		painelMacas = new PainelMacas(gridMacas);
		painelPontuacao = new PainelPontuacao(gridPontuacao);
		painelMovimentosEstrelas = new PainelMovimentoEstrelas(gridMovimentos);
		
	}

}
