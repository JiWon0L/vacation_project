import java.util.Scanner;

public class Main {
	static double n1, n2, n3;
	static int avg1, avg2;

	public static void main(String[] args) {
		input();
		solve();
		output();
	}

	public static void input() {
		Scanner scan = new Scanner(System.in);
		n1 = scan.nextDouble();
		n2 = scan.nextDouble();
		n3 = scan.nextDouble();
	}

	public static void solve() {
		avg1 = (int) Math.round((n1 + n2 + n3) / 3);
		avg2 = (int) Math.round((double) (Math.round(n1) + Math.round(n2) + Math.round(n3)) / 3);
	}

	public static void output() {
		System.out.println(avg1 + "\n" + avg2);
	}
}
