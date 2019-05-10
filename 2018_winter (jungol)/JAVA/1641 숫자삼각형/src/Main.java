import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		int n, m;

		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();

		if ((n % 2 == 1) && (n > 0) && (n <= 100) && (m >= 1) && (m <= 3)) {
			if (m == 1) {
				int number = 1;
				for (int i = 1; i <= n; i++) {
					if (i % 2 == 0) {
						number = number + i;
						for (int j = 0; j < i; j++) {
							number = number - 1;
							System.out.print(number + " ");
						}
					} else if (i % 2 == 1) {
						number = number + i - 1;
						for (int j = 0; j < i; j++) {
							System.out.print(number + " ");
							number = number + 1;
						}
					}
					System.out.println();
				}
			} else if (m == 2) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < i; j++) {
						System.out.print("  ");
					}
					for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
						System.out.print(i + " ");
					}
					System.out.println();
				}
			} else if (m == 3) {
				for (int i = 1; i <= n; i++) {
					if (i <= n / 2 + 1) {
						for (int j = 1; j <= i; j++) {
							System.out.print(j + " ");
						}
					} else {
						for (int j = 1; j <= n % i + 1; j++) {
							System.out.print(j + " ");
						}
					}
					System.out.println();
				}
			}
		} else
			System.out.println("INPUT ERROR!");
	}
}
