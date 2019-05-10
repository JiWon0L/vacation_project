import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, m;

		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();

		for (int i = 0 ; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j <= m; j++) {
					System.out.print((i * m + j) + " ");
				}
				System.out.println();
			}
			if (i % 2 == 1) {
				for (int j = 0 ; j < m; j++) {
					System.out.print(((i + 1) * m - j) + " ");
				}
				System.out.println();
			}
		}
	}
}
