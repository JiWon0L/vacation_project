import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		int[][] array = new int[4][3];
		int sum = 0;

		Scanner scan = new Scanner(System.in);
		System.out.print("1class? ");
		for (int i = 0; i < 3; i++) {
			num = scan.nextInt();
			array[0][i] = num;
		}
		System.out.print("2class? ");
		for (int i = 0; i < 3; i++) {
			num = scan.nextInt();
			array[1][i] = num;
		}
		System.out.print("3class? ");
		for (int i = 0; i < 3; i++) {
			num = scan.nextInt();
			array[2][i] = num;
		}
		System.out.print("4class? ");
		for (int i = 0; i < 3; i++) {
			num = scan.nextInt();
			array[3][i] = num;
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				sum += array[i][j];
			}
			System.out.println((i + 1) + "class : " + sum);
			sum = 0; 
		}
	}
}
