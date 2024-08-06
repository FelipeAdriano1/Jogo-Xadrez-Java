package xadrez.peca;

public class Empty extends Peca {
	
	final String nome = "-";

	public Empty(int x, int y, int jogador) {
		super(x, y, jogador);
	}

	public boolean mover(int nX, int nY) {
		if (Math.abs(nX - x) <= 1 && Math.abs(nY - y) <= 1) {
			setX(x);
			setY(y);
			return true;
		} else {
			return false;
		}
	}

	public String getNome() {
		return nome;
	}
	
	public int getJogador() {
		return jogador;
	}
}
