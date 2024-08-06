package xadrez.peca;

public class Bispo extends Peca{

	final String nome = "B";

	public Bispo(int x, int y, int jogador) {
		super(x, y, jogador);
	}

	public boolean mover(int nX, int nY) {
		if (Math.abs(nX - x) == Math.abs(nY - y)) {
			setX(nX);
			setY(nY);
			System.out.println("\nMovimento válido !");
			return true;
		} 
		else {
			System.out.println("\nMovimento inválido do bispo na posição X:" + getX() + " Y:" + getY() + "\n");
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
