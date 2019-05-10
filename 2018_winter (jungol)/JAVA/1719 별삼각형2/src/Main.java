import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, m;

		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();

		if ((n % 2 == 1) && (n > 0 && n <= 100) && (m >= 1 && m <= 4)) {
			if (m == 1) {
				for (int i = 1; i <= n; i++) {
					if (i <= n / 2 + 1) {
						for (int j = 0; j < i; j++) {
							System.out.print("*");
						}
					} else {
						for (int j = n / 2; j > (n / 2) - (n - i) - 1; j--) {
							System.out.print("*");
						}
					}
					System.out.println();
				}
			} else if (m == 2) {
				for (int i = 1; i <= n; i++) {
					if (i <= n / 2 + 1) {
						for (int j = n / 2; j >= i; j--) {
							System.out.print(" ");
						}
						for (int j = 0; j < i; j++) {
							System.out.print("*");
						}
					} else {
						for (int j = n / 2; j > n % i; j--) {
							System.out.print(" ");
						}
						for (int j = 0; j <= n % i; j++) {
							System.out.print("*");
						}
					}
					System.out.println();
				}
			} else if (m == 3) {
				for (int i = 1; i <= n; i++) {
					if (i <= n / 2 + 1) {
						for (int j = 1; j < i; j++) {
							System.out.print(" ");
						}
						for (int j = 2 * i - 1; j <= n; j++) {
							System.out.print("*");
						}
					} else {
						for (int j = 0; j < n % i; j++) {
							System.out.print(" ");
						}
						for (int j = n % i; j < i; j++) {
							System.out.print("*");
						}
					}
					System.out.println();
				}
			} else if (m == 4) {
				for (int i = 1; i <= n; i++) {
					if (i <= n / 2 + 1) {
						for (int j = 1; j < i; j++) {
							System.out.print(" ");
						}
						for (int j = i; j <= n / 2 + 1; j++) {
							System.out.print("*");
						}
					} else {
						for (int j = 0; j < n / 2; j++) {
							System.out.print(" ");
						}
						for (int j = 0; j < i - n / 2; j++) {
							System.out.print("*");
						}
					}
					System.out.println();
				}
			}
		} else {
			System.out.println("INPUT ERROR!");
		}
	}
}
