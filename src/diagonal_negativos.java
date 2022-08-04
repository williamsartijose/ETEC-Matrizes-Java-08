import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um n�mero inteiro N (m�ximo = 10) 
//e uma matriz quadrada de ordem N
//contendo n�meros inteiros. Em seguida, 
//mostrar a diagonal principal e a quantidade de valores
//negativos da matriz. 

public class diagonal_negativos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, qtdnegativos;

		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();

		int[][] matriz = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println("DIAGONAL PRINCIPAL:");

		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", matriz[i][i]);
		}

		qtdnegativos = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					qtdnegativos++;
				}
			}
		}

		System.out.printf("\nQUANTIDADE DE NEGATIVOS = %d\n", qtdnegativos);

		sc.close();
	}
}
