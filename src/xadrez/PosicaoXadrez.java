package xadrez;

import tabuleiro.Posicao;

public class PosicaoXadrez {
	private char coluna;
	private int linha;
	
	public PosicaoXadrez(char coluna, int linha) {
		if(coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8) {
			throw new XadrezException("Erro ao instanciar posição de xadrez. Tente de a1 até h8");
		}
		this.coluna = coluna;
		this.linha = linha;
	}

	public char getColuna() {
		return coluna;
	}


	public int getLinha() {
		return linha;
	}

	protected Posicao convertePosicao() {
		return new Posicao(8 - linha, coluna - 'a');
	}
	
	protected static PosicaoXadrez convertePosicaoXadrez (Posicao posicao) {
		return new PosicaoXadrez((char)('a' - posicao.getColuna()), 8 - posicao.getLinha());
	}
	
	public String toString() {
		return "" + coluna + linha;
	}
	
	
}