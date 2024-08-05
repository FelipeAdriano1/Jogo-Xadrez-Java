package xadrez.peca;

public class Rei extends Peca {
	
	final String nome = "K";
	
	public Rei(int x, int y) {
		super(x, y);
	}
	
	public boolean mover(int nX, int nY) {
		System.out.println("\nMovimentando a peça K...");
		
		if(Math.abs(nX - x) <= 1 && Math.abs(nY - y) <= 1) {
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
