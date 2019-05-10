import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;

		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		square(n);
	}

	public static void square(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print((n * i + j) + " ");
			}
			System.out.println();
		}
	}
}
