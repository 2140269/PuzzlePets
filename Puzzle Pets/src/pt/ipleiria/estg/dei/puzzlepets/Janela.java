 package pt.ipleiria.estg.dei.puzzlepets;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import pt.ipleiria.estg.dei.gridpanel.JBackgroundPanel;
import pt.ipleiria.estg.dei.gridpanel.GridPanel;

@SuppressWarnings("unused")
public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final GridPanel GridPanel = null;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Janela() {
		setTitle("Puzzle Pets");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(new Dimension(500, 600));
		contentPane = new JPanel();
																	/*
																	JLayeredPane jLayeredPane = new JLayeredPane();
																	jLayeredPane.add(contentPane, new Integer(0), 1);
																	contentPane.add(jLayeredPane, BorderLayout.NORTH);
																	*/
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JBackgroundPanel backgroundPanel = new JBackgroundPanel();
		backgroundPanel.setBackgroundImage("/fundos/fundo3.png");
		contentPane.add(backgroundPanel, BorderLayout.CENTER);
		backgroundPanel.setLayout(new BorderLayout(0, 0));

		GridPanel gridPrincipal = new GridPanel();
		gridPrincipal.setNumberOfRows(8);
		gridPrincipal.setNumberOfColumns(8);
		backgroundPanel.add(gridPrincipal, BorderLayout.SOUTH);
		

		GridPanel gridMovimentos = new GridPanel();
		gridMovimentos.setBounds(824, 81, 120, 300);
		gridMovimentos.setOpaque(false);
		gridMovimentos.setPreferredSize(new Dimension(36, 500));
		gridMovimentos.setNumberOfRows(1);
		gridMovimentos.setRowSize(90);
		gridMovimentos.setNumberOfColumns(3);
		gridMovimentos.setColumnSize(120);
		backgroundPanel.add(gridMovimentos, BorderLayout.NORTH);

		GridPanel gridMacas = new GridPanel();
		gridMacas.setBounds(824, 81, 120, 300);
		gridMacas.setPreferredSize(new Dimension(36, 500));
		gridMacas.setNumberOfRows(1);
		gridMacas.setRowSize(80);
		gridMacas.setNumberOfColumns(3);
		gridMacas.setColumnSize(150);
		backgroundPanel.add(gridMacas, BorderLayout.WEST);

		GridPanel gridPontuacao = new GridPanel();
		gridPontuacao.setBounds(824, 81, 120, 300);
		gridPontuacao.setPreferredSize(new Dimension(36, 500));
		gridPontuacao.setNumberOfRows(1);
		gridPontuacao.setRowSize(80);
		gridPontuacao.setNumberOfColumns(3);
		gridPontuacao.setColumnSize(150);
		backgroundPanel.add(gridPontuacao, BorderLayout.EAST);
		
		GridPanel panel = new GridPanel ();
		Jogo jogo = new Jogo(gridMacas, gridMovimentos, gridPrincipal, gridPontuacao);
		
	}
}
