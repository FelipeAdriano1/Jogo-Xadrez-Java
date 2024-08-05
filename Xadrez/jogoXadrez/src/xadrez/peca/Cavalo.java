package xadrez.peca;

public class Cavalo extends Peca {

	final String nome = "H";

	public Cavalo(int x, int y) {
		super(x, y);
	}

	public boolean mover(int nX, int nY) {
		if ((Math.abs(nX - x) == 1 && Math.abs(nY - y) == 2) ||
				(Math.abs(nX - x) == 2 && Math.abs(nY - y) == 1)) {
			setX(x);
			setY(y);
			System.out.println("\nMovimento válido !\n");
			return true;
		} 
		else {
			System.out.println("\nMovimento Inválido.\n");
			return false;
		}
	}

	public String getNome() {
		return nome;
	}
}
