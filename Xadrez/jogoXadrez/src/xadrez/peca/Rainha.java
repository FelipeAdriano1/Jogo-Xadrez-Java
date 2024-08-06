package xadrez.peca;

public class Rainha extends Peca {

	final String nome = "Q";

	public Rainha(int x, int y, int jogador) {
		super(x, y, jogador);
	}

	public boolean mover(int nX, int nY) {
		if (Math.abs(nX - x) <= 0 || Math.abs(nY - y) <= 0) {
			setX(nX);
			setY(nY);
			return true;
		} 
		if(Math.abs(nX - x) == Math.abs(nY - y)) {
			setX(nX);
			setY(nY);
			System.out.println("\nMovimento válido !");
			return true;
		}
		else {
			System.out.println("\nMovimento inválido da rainha na posição X:" + getX() + " Y:" + getY() + "\n");
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
