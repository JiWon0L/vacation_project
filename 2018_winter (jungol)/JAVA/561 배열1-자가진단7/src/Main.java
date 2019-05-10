import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		int[] array = new int[10];
		int max = 0, min = 10000;

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			num = scan.nextInt();
			array[i] = num;
		}

		for (int i = 0; i < array.length; i++) {
			if (max < array[i] && array[i] < 100 && array[i] > 0) {
				max = array[i];
			}
			if( min > array[i] && array[i] > 99 && array[i] < 10000) {
				min = array[i];
			}
		}
		if(max == 0) {
			System.out.print("100 " + min);
		}
		else if(min == 10000) {
			System.out.print(max + " 100");
		}
		else {
			System.out.print(max + " " + min);
		}
	}
}
