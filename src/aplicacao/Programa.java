package aplicacao;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.PartidaDeXadrez;
import xadrez.PartidaDeXadrez;

public class Programa {

	public static void main(String[] args) {
		
		PartidaDeXadrez partidaDexadrez = new PartidaDeXadrez();
		UI.printTabuleiro(partidaDexadrez.getPecas());
	}

}
