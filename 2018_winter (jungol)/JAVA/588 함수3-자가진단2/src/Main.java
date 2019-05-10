import java.util.Scanner;

public class Main {
	static int n;

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		output(n, 1);
	}

	public static void output(int n, int m) {
		System.out.print(n + " ");
		if (n == m) {
			return;
		} else {
			output(n - 1, m);
		}
	}
}
