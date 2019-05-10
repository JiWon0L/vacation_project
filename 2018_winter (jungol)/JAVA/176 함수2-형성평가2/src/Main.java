import java.util.Scanner;

public class Main {
	static double d1, d2;
	static int num = 0;

	public static void main(String[] args) {
		input();
		solve();
		output();
	}

	public static void input() {
		Scanner scan = new Scanner(System.in);
		d1 = scan.nextDouble();
		d2 = scan.nextDouble();
	}

	public static void solve() {
		double n1 = Math.sqrt(d1);
		double n2 = Math.sqrt(d2);
		if (n1 > n2) {
			int temp = (int) n1;
			n1 = n2;
			n2 = temp;
		}
		for (int i = (int) Math.ceil(n1); i <= (int) Math.floor(n2); i++) {
			num++;
		}
	}

	public static void output() {
		System.out.println(num);
	}
}
