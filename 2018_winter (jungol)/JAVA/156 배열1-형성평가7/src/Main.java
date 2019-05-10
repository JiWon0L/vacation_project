import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		int[] array = new int[100];
		int cnt = 0;
		int empty;
		int min = 0, max = 0;

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			num = scan.nextInt();
			if (num == 999) {
				break;
			}
			array[i] = num;
			cnt++;
		}

		min = array[0];
		max = array[0];
		for (int i = 1; i < cnt; i++) {
			if (min > array[i]) {
				min = array[i];
			}
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.print("max : " + max + "\nmin : " + min);
	}
}
