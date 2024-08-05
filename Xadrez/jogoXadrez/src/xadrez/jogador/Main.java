package xadrez.jogador;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import xadrez.peca.*;
import xadrez.tabuleiro.*;

public class Main extends Jogador {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cordY = 0;
		int cordX = 0;
		int destX = 0;
		int destY = 0;
		boolean vez = true;
		int opt = 0;
		
		Jogador j1 = new Jogador();
		Jogador2 j2 = new Jogador2();
		Tabuleiro tab = new Tabuleiro(j1.retornarP(), j2.retornarP());
		
		Peca[][] t = tab.retornar();
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				System.out.print(t[i][j].getNome() + "   ");
			}
			System.out.println();
		}
		
		while(vez) {
			System.out.println("\n1 - Continuar\n2 - Encerrar partida");
			opt = Integer.parseInt(br.readLine());
			if(opt == 2) {System.out.println("\nSaindo..."); vez = false; break;}
			
			System.out.println("\nDigite as coordenadas X da peça que quer movimentar: ");
			cordX = Integer.parseInt(br.readLine());
			System.out.println("Digite as coordenadas Y da peça que quer movimentar: ");
			cordY = Integer.parseInt(br.readLine());
			
			System.out.println("Digite as coordenadas X de destino: ");
			destX = Integer.parseInt(br.readLine());
			System.out.println("Digite as coordenadas Y de destino: ");
			destY = Integer.parseInt(br.readLine());
			
			tab.movimentar(cordY, cordX, destY, destX);
			
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					System.out.print(t[i][j].getNome() + "   ");
				}
				System.out.println();
			}
		}
	}
}
