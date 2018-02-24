package matematica.algebraLinear.eliminacaoGauss;

import java.util.Scanner;

public class start {

	public static void main(String[] args) {
		
		
		int equacoes = 3;
		int variaveis = 3;
		Scanner scan = new Scanner(System.in);
		
		Matriz matriz = new Matriz(equacoes, variaveis);
		
		for(int i = 0; i < equacoes; i++) {
			
			System.out.println("Informe os valore para a equacao " + (i+1) + ": ");
			
			for(int j = 0; j < variaveis; j++) {
				
				System.out.print("X" + (j+1) + "= ");
				matriz.modify(i, j, scan.nextInt());
				
			}
			
			System.out.print("O resultado da equacao e igual a: ");
			matriz.modify(i, (variaveis), scan.nextInt());
			
		}
		
		matriz.print();
		
		Resolve resolve = new Resolve();

	}

}
