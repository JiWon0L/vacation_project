import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		int[] array = new int[10];
	
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			n = scan.nextInt();
			array[i] = n;
		}
		
		int min = array[0];
		
		for (int i = 1; i < 10; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.print(min);
	}
}