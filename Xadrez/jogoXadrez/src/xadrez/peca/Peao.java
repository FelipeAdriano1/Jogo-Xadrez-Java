package xadrez.peca;

public class Peao extends Peca {

	final String nome = "P";

	public Peao(int x, int y, int jogador) {
		super(x, y, jogador);
	}

	public boolean mover(int nX, int nY) {
		if (jogador == 1) {
				if(y == getY()) {
				setX(nX);
				setY(nY);
				
				System.out.println("\nMovimento do peão do jogador 1");
				return true;
			}
			else {
				System.out.println("Movimento inválido do peão na posição X:" + getX() + " Y:" + getY() + "\n");
				return false;
			}
		}
		else if(jogador == 2) {
			if(y == getY()) {
				setX(nX);
				setY(nY);
				System.out.println("\nMovimento do peão do jogador 2");
				return true;
			}
			else {
				System.out.println("Movimento inválido do peão na posição X:" + getX() + " Y:" + getY() + "\n");
				return false;
			}
		}
		return false;
	}

	public String getNome() {
		return nome;
	}
	
	public int getJogador() {
		return jogador;
	}
}
