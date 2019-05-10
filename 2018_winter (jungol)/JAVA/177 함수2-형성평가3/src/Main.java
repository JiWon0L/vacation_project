import java.util.Scanner;

public class Main {
	static int num;
	static int[] array = new int[5];

	public static void main(String[] args) {
		input();
		solve();
		output();
	}

	public static void input() {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
	}

	public static void solve() {
		num = 0;
		for (int i = 0; i < array.length; i++) {
			num += (Math.abs(array[i]));
		}
	}

	public static void output() {
		System.out.println(num);
	}
}
