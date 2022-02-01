package matriz.exercicios_propostos;

import java.util.Scanner;

public class Numeros_Inteiros_A_B_Matriz_C {

	public static void main(String[] args) {

		/* exercicio_05
		 * Fazer um programa para ler duas matrizes de n�meros inteiros A e B, contendo
		 * de M linhas e N colunas cada. Depois, gerar uma terceira matriz C
		 * onde cada elemento desta � a soma dos elementos correspondentes das matrizes
		 * originais. Imprimir na tela a matriz gerada.
		 * 
		 * Entrada:
		 * 
		 * A entrada cont�m os valores de M e N, depois os valores da primeira matriz A,
		 * depois os valores da segunda matriz B, conforme exemplo.
		 * 
		 * Sa�da: A sa�da cont�m os valores da matriz gerada C, conforme exemplo.
		 */

		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		int[][] A = new int[M][N];
		int[][] B = new int[M][N];
		int[][] C = new int[M][N];
		
		// leitura da matriz A
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				A[i][j] = sc.nextInt();
			}
		}

		// leitura da matriz B
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		
		// gera��o da matriz C
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		
		// impress�o da matriz C na tela
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

	}

}
