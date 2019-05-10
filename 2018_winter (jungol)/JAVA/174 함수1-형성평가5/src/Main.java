import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		int[][] array = new int[4][4];

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				num = scan.nextInt();
				array[i][j] = num;
			}
		}
		sum(array);

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void sum(int[][] array) {
		for (int i = 0; i < 4; i++) {
			if (array[i][3] == 0) {
				for (int j = 0; j < 3; j++) {
					array[i][3] += array[i][j];
				}
			}
			if (array[3][i] == 0) {
				for (int j = 0; j < 3; j++) {
					array[3][i] += array[j][i];
				}
			}
		}
	}
}
