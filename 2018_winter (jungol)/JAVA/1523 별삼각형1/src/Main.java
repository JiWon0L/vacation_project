import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n, m;
		
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		
		if((n >= 1 && n <= 100)&&(m >= 1 && m <= 3) ) {
			if(m == 1) {
				for(int i = 1 ; i <= n ; i++) {
					for(int j = 0 ; j < i ; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}else if(m == 2){
				for(int i = n ; i > 0 ; i--) {
					for(int j = 0 ; j < i ; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}else if(m == 3) {
					for(int i = 0 ; i < n ; i++) {
						for(int j = n - 1 ; j > i ; j--) {
							System.out.print(" ");
						}
						for(int j = 0 ; j <= (2 * i) ; j++) {
							System.out.print("*");
						}
						System.out.println();
					}
			}
		}
		else {
			System.out.println("INPUT ERROR!");
		}
	}
}
