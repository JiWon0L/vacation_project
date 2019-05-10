import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		int number;

		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			number = scan.nextInt();
			array[i] = number;
		}
		compare(array);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void compare(int[] array) {
		int temp;
		for (int i = 1; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[j - 1] < array[j]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
	}
}
