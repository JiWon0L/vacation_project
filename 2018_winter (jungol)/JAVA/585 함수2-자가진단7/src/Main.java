import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		int[] array = new int[10];

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			num = scan.nextInt();
			array[i] = num;
		}
		bubble(array);
	}

	public static void bubble(int[] array) {
		int temp;
		for (int i = 1; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[j - 1] < array[j]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[j] + " ");
			}
			System.out.println();
		}
	}
}
