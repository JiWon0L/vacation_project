import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, num, number = 0;
		int empty;
		int max;
		boolean check = false;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int[] array = new int[n];

		for (int i = 0; i < n; i++) {
			num = scan.nextInt();
			array[i] = num;
		}

		for (int i = 0; i < n; i++) {
			max = array[i];
			check = false;
			for (int j = i; j < n; j++) {
				if (max < array[j]) {
					max = array[j];
					number = j;
					check = true;
				}
			}
			if (check == true) {
				empty = max;
				array[number] = array[i];
				array[i] = empty;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}
	}
}
