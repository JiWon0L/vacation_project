import java.util.Scanner;

public class Main {
	static int num;

	public static void main(String[] args) {
		input();
		solve();
		output();
	}

	public static void input() {
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
	}

	public static void solve() {
		num = (int) Math.pow(2, num);
	}

	public static void output() {
		System.out.println(num);
	}
}
