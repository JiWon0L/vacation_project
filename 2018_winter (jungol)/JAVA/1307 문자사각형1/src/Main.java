import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();

		int number = (n * n % 26) + 65 - 1;
		int score = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				score = number - (n * j) % 26;
				if (score < 65) {
					score = score + 26;
				}
				System.out.print((char) score + " ");
			}
			System.out.println();
			number = number - 1;
			if (number < 65) {
				number = 90;
			}
		}
	}
}
