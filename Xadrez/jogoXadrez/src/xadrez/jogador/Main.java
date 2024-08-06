package xadrez.jogador;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import xadrez.peca.*;
import xadrez.tabuleiro.*;

public class Main extends Jogador {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cordY;
		int cordX;
		int destX;
		int destY;
		boolean vez = true;
		boolean jogador1 = true;
		//boolean jogador2 = false;
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
			int jog = jogador1 ? 1 : 2;
			
			System.out.println("Vez do jogador: " + jog);
			System.out.println("\n1 - Continuar\n2 - Encerrar partida");
			opt = Integer.parseInt(br.readLine());
			if(opt == 2) {System.out.println("\nJogador " + jog + " saindo da partida..."); vez = false; break;}
			
			System.out.println("\nDigite a coluna da peça que quer movimentar: ");
			cordX = Integer.parseInt(br.readLine());
			System.out.println("Digite a linha da peça que quer movimentar: ");
			cordY = Integer.parseInt(br.readLine());
			
			System.out.println("Digite a linha de destino: ");
			destX = Integer.parseInt(br.readLine());
			System.out.println("Digite a coluna de destino: ");
			destY = Integer.parseInt(br.readLine());
			
			System.out.println("\nMovimento de destino X:" + destX + " Y:" + destY);
			
			boolean isValid = tab.movimentar(cordY, cordX, destY, destX, jogador1);
			
			if(isValid == true) {
				jogador1 = !jogador1;
			}
			
			for(int i = 0; i < 8; i++) {
				for(int j = 0; j < 8; j++) {
					System.out.print(t[i][j].getNome() + "   ");
				}
				System.out.println();
			}
		}
	}
}
