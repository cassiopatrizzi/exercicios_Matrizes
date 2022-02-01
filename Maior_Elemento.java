package matriz.exercicios_propostos;

import java.util.Scanner;

public class Maior_Elemento {

	public static void main(String[] args) {

		/* exercicio_03
		 * Ler um inteiro N e uma matriz quadrada de ordem N. Mostrar qual
		 * o maior elemento de cada linha. Suponha não haver empates.
		 * 
		 * Entrada: A entrada contém o número N, depois os dados da matriz.
		 * 
		 * Saída: A saída contém os números representando o maior elemento de cada linha
		 * da matriz.
		 */

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] mat = new int[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < N; i++) {
			int maiorElemento = mat[i][0];
			for (int j = 1; j < N; j++) {
				if (mat[i][j] > maiorElemento) {
					maiorElemento = mat[i][j];
				}
			}
			System.out.println(maiorElemento);
		}

		sc.close();

	}

}
