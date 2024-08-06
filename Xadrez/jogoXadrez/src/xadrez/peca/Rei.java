package xadrez.peca;

public class Rei extends Peca {
	
	final String nome = "K";
	
	public Rei(int x, int y, int jogador) {
		super(x, y, jogador);
	}
	
	public boolean mover(int nX, int nY) {
		System.out.println("\nMovimentando a peça K...");
		
		if(Math.abs(nX - x) <= 1 && Math.abs(nY - y) <= 1) {
			setX(nX);
			setY(nY);
			System.out.println("\nMovimento válido !");
			return true;
		}
		else {
			System.out.println("\nMovimento inválido do rei na posição X:" + getX() + " Y:" + getY() + "\n");
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
