import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, m;

		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			numbers[i] = scan.nextInt();
		}

		int empty;
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers.length - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					empty = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = empty;
				}
			}
			for (int j = 0; j < numbers.length; j++) {
				System.out.print(numbers[j] + " ");
			}
			System.out.println();
		}
	}
}
