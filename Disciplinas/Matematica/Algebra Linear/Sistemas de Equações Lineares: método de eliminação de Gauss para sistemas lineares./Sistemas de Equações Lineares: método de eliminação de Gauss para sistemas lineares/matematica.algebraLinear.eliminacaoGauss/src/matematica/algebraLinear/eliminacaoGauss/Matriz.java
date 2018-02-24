package matematica.algebraLinear.eliminacaoGauss;

public class Matriz {
	
	private int equacoes;
	private int variaveis;
	private int colunas;
	private int[][] matriz;
	
	public Matriz(int equacoes, int variaveis) {
		super();
		this.equacoes = equacoes;
		this.variaveis = variaveis;
		this.colunas = variaveis + 1;
		
		this.matriz = new int[this.equacoes][this.colunas];
		
		for(int i = 0; i < this.equacoes; i++) {
			for(int j = 0; j < this.colunas; j++) {
				this.matriz[i][j] = 0;
			}
		}
	}
	
	public int modify(int linha, int coluna, int valor) {
		
		this.matriz[linha][coluna] = valor;
		
		return 1;
	}
	
	public int print() {
		
		for(int i = 0; i < this.equacoes; i++) {
			for(int j = 0; j < this.colunas; j++) {
				System.out.print(this.matriz[i][j] + "\t");
			}
			System.out.println("\n");
		}
		
		return 1;
	}
	
	
	
}
