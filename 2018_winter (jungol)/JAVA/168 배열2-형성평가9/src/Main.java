import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;

		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int[][] array = new int[10][10];
		array[0][0] = 1;
		array[1][0] = 1;
		array[1][1] = 1;

		for (int i = 2; i < n; i++) {
			array[i][0] = 1;
			for (int j = 1; j < i; j++) {
				array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
			}
			array[i][i] = 1;
		}

		for (int i = n-1; i >= 0; i--) {
			for (int j = 0; j < n; j++) {
				if (array[i][j] != 0) {
					System.out.print(array[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

}
