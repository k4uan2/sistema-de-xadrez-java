package xadrez;

import pecas.xadrez.Rei;
import pecas.xadrez.Torre;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;

public class PartidaDeXadrez {
	private Tabuleiro tabuleiro;
	
	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8,8);
		configInicial();
	}
	
	public PecaDeXadrez[][] getPecas(){
		PecaDeXadrez[][] mat = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i=0; i<tabuleiro.getLinhas(); i++) {
			for(int j=0; j<tabuleiro.getColunas();j++) {
				mat[i][j] = (PecaDeXadrez) tabuleiro.peca(i,j);
			}
		}
		return mat;
	}
	
	private void colocaNovaPeca(char coluna, int linha, PecaDeXadrez peca){
		tabuleiro.colocarPeca(peca, new PosicaoXadrez(coluna, linha).convertePosicao());
	}
	
	private void configInicial() {
		colocaNovaPeca('b', 6, new Torre(tabuleiro, Cor.BRANCO));
		colocaNovaPeca('e',8, new Rei(tabuleiro, Cor.PRETO));
		colocaNovaPeca('e', 1, new Rei(tabuleiro, Cor.BRANCO));
	}
}
