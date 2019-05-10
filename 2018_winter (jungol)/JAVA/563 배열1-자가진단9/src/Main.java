import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		int[] array = new int[10];
		int empty;
		boolean check = false;

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			num = scan.nextInt();
			array[i] = num;
		}
		for (int i = 0; i < array.length - 1; i++) {
			for(int j = 0 ; j < array.length - 1 - i; j++) {
				if (array[j] < array[j + 1]) {
					empty = array[j + 1];
					array[j + 1] = array[j];
					array[j] = empty;
					check = true;
				}
			}
			if(check == false) {
				break;
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
