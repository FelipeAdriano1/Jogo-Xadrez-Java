package xadrez.jogador;
import xadrez.peca.*;
import xadrez.tabuleiro.*;

public class Jogador2{
	
	Peca pecas2[][] = new Peca[2][8];
	
	public Jogador2() {
		
		Peca r = new Torre(7, 8, 1);
		Peca h = new Cavalo(7, 1, 1);
		Peca b = new Bispo(7, 2, 1);
		Peca k = new Rei(7, 3,1);
		Peca q = new Rainha(7, 4, 1);
		Peca b2 = new Bispo(7, 5, 1);
		Peca h2 = new Cavalo(7, 6, 1);
		Peca r2 = new Torre(7, 7, 1);
		
		Peca p = new Peao(6, 0, 1);
		Peca p2 = new Peao(6, 1, 1);
		Peca p3 = new Peao(6, 2, 1);
		Peca p4 = new Peao(6, 3, 1);
		Peca p5 = new Peao(6, 4, 1);
		Peca p6 = new Peao(6, 5, 1);
		Peca p7 = new Peao(6, 6, 1);
		Peca p8 = new Peao(6, 7, 1);
		
		pecas2[1][0] = r;
		pecas2[1][1] = h;
		pecas2[1][2] = b;
		pecas2[1][3] = k;
		pecas2[1][4] = q;
		pecas2[1][5] = b2;
		pecas2[1][6] = h2;
		pecas2[1][7] = r2;
		
		pecas2[0][0] = p;
		pecas2[0][1] = p2;
		pecas2[0][2] = p3;
		pecas2[0][3] = p4;
		pecas2[0][4] = p5;
		pecas2[0][5] = p6;
		pecas2[0][6] = p7;
		pecas2[0][7] = p8;
	}
	
	public Peca[][] retornarP(){
		return pecas2;
	}
}
