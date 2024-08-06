package xadrez.peca;

public abstract class Peca {

	protected int x = 0;
	protected int y = 0;
	protected int jogador = 0;
	
	public Peca(int x, int y, int jogador) {
		this.x = x;
		this.y = y;
		this.jogador = jogador;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public boolean realizarMovimento(int x, int y) {
		return mover(x, y);
	}
	
	public abstract int getJogador();
	
	public abstract String getNome();
	
	abstract boolean mover(int x, int y);
}
