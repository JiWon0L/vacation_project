import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				System.out.print((j * n + i) + " ");
			}
			System.out.println();
		}
	}
}
