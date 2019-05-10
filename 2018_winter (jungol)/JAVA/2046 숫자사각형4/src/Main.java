import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, m;
		
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		
		if(m == 1) {
			for(int i = 1 ; i <= n ; i++) {
				for(int j = 0 ; j < n ; j++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
		}
		else if(m == 2) {
			for(int i = 1 ; i <= n ; i++) {
				if(i % 2 == 1) {
					for(int j = 0 ; j < n ; j++) {
						System.out.print((j + 1)+ " ");
					}
					System.out.println();
				}
				else if(i % 2 == 0) {
					for(int j = n ; j > 0 ; j--) {
						System.out.print(j + " ");
					}
					System.out.println();
				}
			}
		}
		else if(m == 3) {
			for(int i = 1 ; i <= n ; i++) {
				for(int j = 1 ; j <= n ; j++) {
					System.out.print(i * j + " ");
				}
				System.out.println();
			}
		}
	}
}
