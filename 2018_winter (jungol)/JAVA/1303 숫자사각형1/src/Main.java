import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, m;

		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();

		if (n <= 100 && m <= 100) {
			for (int i = 0; i < n; i++) {
				for (int j = 1; j <= m; j++) {
					System.out.print((i * m) + j + " ");
				}
				System.out.println();
			}
		}
	}
}
