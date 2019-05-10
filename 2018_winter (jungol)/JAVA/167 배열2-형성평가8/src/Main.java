import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		int[][] array = new int[4][2];
		int horEvg = 0, verEvg = 0, totalEvg = 0;

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				num = scan.nextInt();
				array[i][j] = num;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				horEvg += array[i][j];
			}
			horEvg = horEvg / array[i].length;
			System.out.print(horEvg + " ");
			horEvg = 0;
		}
		System.out.println();

		for (int i = 0; i < array[i].length; i++) {
			for (int j = 0; j < array.length; j++) {
				verEvg += array[j][i];
			}
			verEvg = verEvg / array.length;
			System.out.print(verEvg + " ");
			verEvg = 0;
		}
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				totalEvg += array[i][j];
			}
		}
		totalEvg = totalEvg / 8;
		System.out.println(totalEvg);
	}
}
