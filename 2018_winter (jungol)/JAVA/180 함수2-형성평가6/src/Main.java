import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
	static int[] array = new int[7];

	public static void main(String[] args) {
		input();
		solve();
		output();
	}

	public static void input() {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 7; i++) {
			array[i] = scan.nextInt();
		}
	}

	public static void solve() {
		int temp;
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j < 7; j++) {
				if (array[j - 1] > array[j]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
	}

	public static void output() {
		for (int i = 0; i < 7; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
