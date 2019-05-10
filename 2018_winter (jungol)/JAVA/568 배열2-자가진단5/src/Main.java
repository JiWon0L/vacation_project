import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num = 0;
		int[][] array1 = new int[2][4];
		int[][] array2 = new int[2][4];

		Scanner scan = new Scanner(System.in);

		System.out.println("first array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				num = scan.nextInt();
				array1[i][j] = num;
			}
		}

		System.out.println("second array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				num = scan.nextInt();
				array2[i][j] = num;
			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(array1[i][j] * array2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
