package xadrez.peca;

public class Torre extends Peca {

	final String nome = "R";

	public Torre(int x, int y) {
		super(x, y);
	}

	public boolean mover(int nX, int nY) {
		if (Math.abs(nX - x) <= 0 || Math.abs(nY - y) <= 0) {
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
