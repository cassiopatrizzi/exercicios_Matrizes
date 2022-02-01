package matriz.exercicios_propostos;

import java.util.Scanner;

public class SomaDosElementosDasMatrizes {

	public static void main(String[] args) {

		/* exercicio_02
		 * Ler um n�mero N e depois uma matriz quadrada NxN com n�meros
		 * inteiros. Depois, mostrar na tela a soma dos elementos de cada linha da
		 * matriz. 
		 * 
		 * Entrada: A entrada cont�m o n�mero N, depois os dados da matriz.
		 * 
		 * Sa�da: A sa�da cont�m os n�meros representando a soma dos elementos de cada
		 * linha da matriz.
		 */

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] mat = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("SOMA DE CADA LINHA DA MATRIZ:");
		for (int i = 0; i < N; i++) {
			int soma = 0;
			for (int j = 0; j < N; j++) {
				soma = soma + mat[i][j];
			}
			System.out.println(soma);
		}

		sc.close();

	}

}
