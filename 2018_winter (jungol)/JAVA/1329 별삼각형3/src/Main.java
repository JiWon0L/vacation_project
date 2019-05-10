import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;

		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();

		if ((n % 2 == 1) && (n > 0) && (n <= 100)) {
			for (int i = 1; i <= n; i++) {
				if (i <= n / 2 + 1) {
					for (int j = 1; j < i; j++) {
						System.out.print(" ");
					}
					for (int j = 0; j < 2 * i - 1; j++) {
						System.out.print("*");
					}
				} else {
					for (int j = 0; j < n % i; j++) {
						System.out.print(" ");
					}
					for (int j = 0; j < 2 * (n - i + 1) - 1; j++) {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		} else
			System.out.println("INPUT ERROR!");
	}
}
