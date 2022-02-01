package matriz.exercicios_propostos;

import java.util.Scanner;

public class Numeros_Negativos_Lidos {

	public static void main(String[] args) {

		/* exercicio_01
		 * Ler dois n�meros M e N, e depois ler uma matriz MxN de n�meros
		 * inteiros, conforme exemplo. Em seguida, mostrar na tela somente os n�meros
		 * negativos da matriz. 
		 * 
		 * Entrada: A entrada cont�m os n�meros M e N na mesma
		 * linha, depois os dados da matriz. 
		 * 
		 * Sa�da: A sa�da cont�m uma mensagem e depois
		 * os n�meros negativos da matriz.
		 */

		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		int[][] mat = new int[M][N];
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("VALORES NEGATIVOS: ");
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] < 0) {
					System.out.println(mat[i][j] + " ");
				}
			}
		}

		sc.close();

	}

}
