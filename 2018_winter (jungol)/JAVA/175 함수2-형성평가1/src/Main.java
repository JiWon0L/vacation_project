import java.util.Scanner;

public class Main {
	static int n;
	static int[] array;

	public static void main(String[] args) {
		input();
		solve();
		output();
	}

	public static void input() {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		array = new int[n];
		for (int i = 0; i < array.length; i++) {
			n = scan.nextInt();
			array[i] = n;
		}
	}

	public static void solve() {
		int temp;
		for (int i = 1; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[j - 1] < array[j]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
	}

	public static void output() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
