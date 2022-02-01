package matriz.exercicios_propostos;

import java.util.Scanner;

public class Numeros_Negativos_Lidos {

	public static void main(String[] args) {

		/* exercicio_01
		 * Ler dois números M e N, e depois ler uma matriz MxN de números
		 * inteiros, conforme exemplo. Em seguida, mostrar na tela somente os números
		 * negativos da matriz. 
		 * 
		 * Entrada: A entrada contém os números M e N na mesma
		 * linha, depois os dados da matriz. 
		 * 
		 * Saída: A saída contém uma mensagem e depois
		 * os números negativos da matriz.
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
