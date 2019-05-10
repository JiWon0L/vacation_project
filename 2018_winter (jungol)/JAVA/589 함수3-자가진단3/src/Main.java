import java.util.Scanner;

public class Main {
	static int n, sum = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		funtion(n, 1);
		System.out.println(sum);
	}

	public static void funtion(int n, int m) {
		sum += m;
		if (n == m) {
			return;
		} else {
			funtion(n, m + 1);
		}
	}
}
