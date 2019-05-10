import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		int[][] array1 = new int[2][3];
		int[][] array2 = new int[2][3];
		int mul;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("first array");
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array1[i].length; j++) {
				num = scan.nextInt();
				array1[i][j] = num;
			}
		}
		System.out.println("second array");
		for(int i = 0; i < array2.length; i++) {
			for(int j = 0; j < array2[i].length; j++) {
				num = scan.nextInt();
				array2[i][j] = num;
			}
		}
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				mul = array1[i][j] * array2[i][j];
				System.out.print(mul + " ");
			}
			System.out.println();
		}
	}
}
