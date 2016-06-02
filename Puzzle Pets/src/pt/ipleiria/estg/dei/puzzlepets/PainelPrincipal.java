package pt.ipleiria.estg.dei.puzzlepets;

import pt.ipleiria.estg.dei.gridpanel.GridPanel;
import pt.ipleiria.estg.dei.utils.FileHandler;
import pt.ipleiria.estg.dei.puzzlepets.modelo.Animal;
import pt.ipleiria.estg.dei.puzzlepets.modelo.Posicao;
import pt.ipleiria.estg.dei.puzzlepets.modelo.Raposa;
import pt.ipleiria.estg.dei.puzzlepets.modelo.Suporte;
import pt.ipleiria.estg.dei.puzzlepets.modelo.SuporteAgua;
import pt.ipleiria.estg.dei.puzzlepets.modelo.SuporteAr;
import pt.ipleiria.estg.dei.puzzlepets.modelo.SuporteGelo;
import pt.ipleiria.estg.dei.puzzlepets.modelo.SuporteSuportador;

public class PainelPrincipal {

	private static final String AR = "A";
	private static final String AGUA = "U";
	private static final String GELO = "G";
	private static final String PANDA = "P";
	private static final String RAPOSA = "R";
	private static final String SAPO = "S";
	private static final String PEIXE = "E";
	private static final String POLVO = "O";
	private GridPanel gridPanel;
	private Suporte matrizSuportes[][];

	public PainelPrincipal(GridPanel gridPanel) {
		this.gridPanel = gridPanel;
		matrizSuportes = new Suporte[8][8];
		lerFicheiro();
		iniciar();
	
	}

	public void adicionarSuporte(Suporte suporte) {
		matrizSuportes[suporte.getPosicao().getLinha()][suporte.getPosicao().getColuna()] = suporte;
	}
	

	private void lerFicheiro() {
		FileHandler handler = new FileHandler("/niveis/puzzle.txt");
		String conteudo = handler.readFile();

		String[] colunas;
		int numLinha = 0;
		for (String linha : conteudo.split("\n")) {
			colunas = linha.split(" ");
			for (int coluna = 0; coluna < colunas.length; coluna++) {
				String primeiraLetra = colunas[coluna].substring(0, 1);
				String segundaLetra = colunas[coluna].substring(1, 2);
				if (primeiraLetra.equals(AR)) {
					adicionarSuporte(new SuporteAr(this, new Posicao(numLinha, coluna)));
					}
				else if(primeiraLetra.equals(AGUA)){
					adicionarSuporte(new SuporteAgua(this, new Posicao(numLinha, coluna)));		
				}
				else if(primeiraLetra.equals(GELO)){
					adicionarSuporte(new SuporteGelo(this, new Posicao(numLinha, coluna)));					
				}
				if(segundaLetra.equals(PANDA)){
					((SuporteSuportador)matrizSuportes[numLinha][coluna]).setElemento(new Animal( "/animais/panda.png"));
				}
				else if(segundaLetra.equals(RAPOSA)){
					((SuporteSuportador)matrizSuportes[numLinha][coluna]).setElemento(new Animal( "/animais/raposa.png"));
				}
				else if(segundaLetra.equals(POLVO)){
					((SuporteSuportador)matrizSuportes[numLinha][coluna]).setElemento(new Animal( "/animais/polvo.png"));
				}
				else if(segundaLetra.equals(SAPO)){
					((SuporteSuportador)matrizSuportes[numLinha][coluna]).setElemento(new Animal( "/animais/sapo.png"));
				}
				else if(segundaLetra.equals(PEIXE)){
					((SuporteSuportador)matrizSuportes[numLinha][coluna]).setElemento(new Animal( "/animais/peixe.png"));
				}
			}
			numLinha++;
		}
	}
	
	/*
	public void atualizarSuporte(Suporte suporte) {
		gridPanel.clear(suporte.getPosicao().getLinha(), suporte.getPosicao().getColuna());
		gridPanel.put(suporte.getPosicao().getLinha(), suporte.getPosicao().getColuna(), suporte.getImagem());
		gridPanel.repaint();
	}
	*/
	
	private void iniciar() {
		for (int linha=0; linha<8; linha++) {
			for(int coluna=0; coluna<8; coluna++){
				atualizar(matrizSuportes[linha][coluna].getPosicao());
			}
		}

	}

	public void atualizar(Posicao posicao) {
		gridPanel.clear(posicao.getLinha(), posicao.getColuna());
		gridPanel.put(posicao.getLinha(), posicao.getColuna(),
				matrizSuportes[posicao.getLinha()][posicao.getColuna()].getImagem());
		gridPanel.repaint();
	}
	
	/*
	 public void atualizarSuporte(Suporte suporte) {
		gridPanel.clear(suporte.getPosicao().getLinha(),suporte.getPosicao().getColuna());
		gridPanel.put(suporte.getPosicao().getLinha(),suporte.getPosicao().getColuna(), suporte.getImagem());
		gridPanel.repaint();
	}
	 */
	/*
	 public void gerarNivel (){
		for(int i=0;i<getGridPanel().getNumberOfRows();i++){
			for(int j=0;j<getGridPanel().getNumberOfColumns();j++){
				atualizarSuporte(matrizSuportes[i][j]);			
			}
		}
	 */
	
	/*
	 * public void gerarNivel (){ for(int
	 * i=0;i<getGridPanel().getNumberOfRows();i++){ for(int
	 * j=0;j<getGridPanel().getNumberOfColumns();j++){ MatrizSuportes[i][j]=new
	 * SuporteAgua(this, new Posicao(i,j)); atualizar(MatrizSuportes[i][j]); } }
	 * MatrizSuportes[2][0]=new SuporteAr(this, new Posicao(2,0));
	 * MatrizSuportes[3][0]=new SuporteAr(this, new Posicao(3,0));
	 * MatrizSuportes[4][0]=new SuporteAr(this, new Posicao(4,0));
	 * MatrizSuportes[2][3]=new SuporteAr(this, new Posicao(2,3));
	 * MatrizSuportes[3][3]=new SuporteAr(this, new Posicao(3,3));
	 * MatrizSuportes[2][7]=new SuporteAr(this, new Posicao(2,7));
	 * MatrizSuportes[3][7]=new SuporteAr(this, new Posicao(3,7));
	 * MatrizSuportes[4][7]=new SuporteAr(this, new Posicao(4,7));
	 * MatrizSuportes[7][0]=new SuporteAr(this, new Posicao(7,0));
	 * MatrizSuportes[7][7]=new SuporteAr(this, new Posicao(7,7));
	 * atualizar(MatrizSuportes[2][0]); atualizar(MatrizSuportes[3][0]);
	 * atualizar(MatrizSuportes[4][0]); atualizar(MatrizSuportes[2][3]);
	 * atualizar(MatrizSuportes[3][3]); atualizar(MatrizSuportes[2][7]);
	 * atualizar(MatrizSuportes[3][7]); atualizar(MatrizSuportes[4][7]);
	 * atualizar(MatrizSuportes[7][0]); atualizar(MatrizSuportes[7][7]);
	 * 
	 * MatrizSuportes[2][1]=new SuporteGelo(this, new Posicao(2,1));
	 * MatrizSuportes[2][2]=new SuporteGelo(this, new Posicao(2,2));
	 * MatrizSuportes[2][4]=new SuporteGelo(this, new Posicao(2,4));
	 * MatrizSuportes[2][5]=new SuporteGelo(this, new Posicao(2,5));
	 * MatrizSuportes[3][1]=new SuporteGelo(this, new Posicao(3,1));
	 * MatrizSuportes[3][2]=new SuporteGelo(this, new Posicao(3,2));
	 * MatrizSuportes[3][4]=new SuporteGelo(this, new Posicao(3,4));
	 * MatrizSuportes[3][5]=new SuporteGelo(this, new Posicao(3,5));
	 * MatrizSuportes[2][6]=new SuporteGelo(this, new Posicao(2,6));
	 * MatrizSuportes[3][6]=new SuporteGelo(this, new Posicao(3,6));
	 * atualizar(MatrizSuportes[2][1]); atualizar(MatrizSuportes[2][2]);
	 * atualizar(MatrizSuportes[2][4]); atualizar(MatrizSuportes[2][5]);
	 * atualizar(MatrizSuportes[3][1]); atualizar(MatrizSuportes[3][2]);
	 * atualizar(MatrizSuportes[3][4]); atualizar(MatrizSuportes[3][5]);
	 * atualizar(MatrizSuportes[2][6]); atualizar(MatrizSuportes[3][6]); }
	 * 
	 */

	public GridPanel getGridPanel() {
		return gridPanel;
	}

	public void setGridPanel(GridPanel gridPanel) {
		this.gridPanel = gridPanel;
	}
}