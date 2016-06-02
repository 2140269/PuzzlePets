package pt.ipleiria.estg.dei.puzzlepets.modelo;

public class Temporizador {
	private int intervalo;
	private long proximoTempo;

	public Temporizador(int intervalo) {
		super();
		this.intervalo = intervalo;
		reiniciar();
	}

	private void reiniciar() {
		proximoTempo = System.currentTimeMillis() + intervalo;
	}

	public int getMilissegundosEmFalta() {
		return (int) Math.max(0, proximoTempo - System.currentTimeMillis());
	}

	public int getSegundosEmFalta() {
		return (int) Math.ceil(getMilissegundosEmFalta() / 1000d);
	}

}
