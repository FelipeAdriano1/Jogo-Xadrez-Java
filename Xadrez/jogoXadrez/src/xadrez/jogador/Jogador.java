package xadrez.jogador;
import xadrez.tabuleiro.*;

import xadrez.peca.*;
import xadrez.tabuleiro.*;

public class Jogador{
	
	Peca pecas[][] = new Peca[2][8];
	
	public Jogador() {
		
		Peca r = new Torre(0, 0, 2);
		Peca h = new Cavalo(0, 1, 2);
		Peca b = new Bispo(0, 2, 2);
		Peca k = new Rei(0, 3, 2);
		Peca q = new Rainha(0, 4, 2);
		Peca b2 = new Bispo(0, 5, 2);
		Peca h2 = new Cavalo(0, 6, 2);
		Peca r2 = new Torre(0, 7, 2);
		
		Peca p = new Peao(1, 0, 2);
		Peca p2 = new Peao(1, 1, 2);
		Peca p3 = new Peao(1, 2, 2);
		Peca p4 = new Peao(1, 3, 2);
		Peca p5 = new Peao(1, 4, 2);
		Peca p6 = new Peao(1, 5, 2);
		Peca p7 = new Peao(1, 6, 2);
		Peca p8 = new Peao(1, 7, 2);
		
		pecas[0][0] = r;
		pecas[0][1] = h;
		pecas[0][2] = b;
		pecas[0][3] = k;
		pecas[0][4] = q;
		pecas[0][5] = b2;
		pecas[0][6] = h2;
		pecas[0][7] = r2;
		
		pecas[1][0] = p;
		pecas[1][1] = p2;
		pecas[1][2] = p3;
		pecas[1][3] = p4;
		pecas[1][4] = p5;
		pecas[1][5] = p6;
		pecas[1][6] = p7;
		pecas[1][7] = p8;
	}
	
	public Peca[][] retornarP(){
		return pecas;
	}
}
