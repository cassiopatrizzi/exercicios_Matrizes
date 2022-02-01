package matriz.exercicios_propostos;

import java.util.Locale;
import java.util.Scanner;

public class SomaPositivos_Linha_Coluna_Diagonal_NegativosAoQuadrado {

	public static void main(String[] args) {

		/*
		 * exercicio_06 
		 * Ler uma matriz quadrada de ordem N, contendo n�meros reais. Em
		 * seguida, fazer as seguintes a��es:
		 * 
		 * a) calcular e imprimir a soma de todos os elementos positivos da matriz.
		 * 
		 * b) fazer a leitura do �ndice de uma linha da matriz e, da�, imprimir todos os
		 * elementos desta linha.
		 * 
		 * c) fazer a leitura do �ndice de uma coluna da matriz e, da�, imprimir todos
		 * os elementos desta coluna. d) imprimir os elementos da diagonal principal da
		 * matriz.
		 * 
		 * e) alterar a matriz elevando ao quadrado todos os n�meros negativos da mesma.
		 * Em seguida imprimir a matriz alterada.
		 * 
		 * Entrada: A entrada cont�m o n�mero inteiro N, seguido dos valores da matriz
		 * com uma casa decimal cada, seguido do �ndice de uma linha, seguido do �ndice
		 * de uma coluna, conforma exemplo.
		 * 
		 * Sa�da: A sa�da cont�m os valores de sa�da de cada a��o, com uma casa decimal,
		 * na ordem em que foram apresentadas no enunciado, conforme exemplo.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double[][] mat = new double[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextDouble();

			}
		}

		// a) soma dos positivos
		double soma = 0.0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] > 0.0) {
					soma = soma + mat[i][j];
				}
			}

		}
		System.out.printf("SOMA DOS POSITIVOS: %.1f%n", soma);

		// b) imprimir os elementos da linha escolhida
		System.out.print("LINHA ESCOLHIDA: ");
		for (int j = 0; j < N; j++) {
			System.out.printf("%.1f ", mat[1][j]);
		}
		System.out.println();

		// c) para imprimir os elementos da coluna escollhida
		System.out.print("COLUNA ESCOLHIDA: ");
		for (int i = 0; i < N; i++) {
			System.out.printf("%.1f ", mat[i][2]);
		}
		System.out.println();

		// d) imprimir a diagonal pricipal
		System.out.print("DIAGONAL PRINCIPAL: ");
		for (int i = 0; i < N; i++) {
			System.out.printf("%.1f ", mat[i][i]);
		}
		System.out.println();

		// e) alterar a matriz elevando os negativos ao quadrado
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] < 0.0) {
					mat[i][j] = mat[i][j] * mat[i][j];
				}
			}
		}
		System.out.println("MATRIZ ALTERADA: ");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.printf("%.1f ", mat[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}

}
