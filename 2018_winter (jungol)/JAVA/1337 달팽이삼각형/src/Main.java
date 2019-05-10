import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		int x = 0;
		int y = 0;
		int number = 0;

		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int[][] num = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {

				if (i % 3 == 0) {
					x++;
					y++;
				} else if (i % 3 == 1) {
					x--;
				} else if (i % 3 == 2) {
					y--;
				}
				num[x - 1][y - 1] = number;

				number++;

				if (number > 9) {
					number = 0;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(num[j][i] + " ");
			}
			System.out.println();
		}
	}

}

//import java.util.Scanner;
//
//public class Main {
//   public static void main(String args[]) {
//      Scanner scan = new Scanner(System.in);
//      int n = scan.nextInt();
//      int x = -1, y = -1, num = -1, pattern = 0;
//      ;
//      int[][] num_array = new int[n][n];
//
//      for (int i = n; i > 0; i--) {
//         for (int j = 0; j < i; j++) {
//
//            num++;
//
//            if (num > 9) {
//               num = 0;
//            }
//
//            if (pattern == 0) {
//               x++;
//               y++;
//            } else if (pattern == 1) {
//               x--;
//            } else {
//               y--;
//            }
//            num_array[y][x] = num;
//         }
//         pattern++;
//         if (pattern > 2) {
//            pattern = 0;
//         }
//      }
//      for (int i = 0; i < n; i++) {
//         for (int j = 0; j <= i; j++) {
//            System.out.print(num_array[i][j] + " ");
//         }
//         System.out.println();
//      }
//   }
//}