
public class Main {

	public static void main(String[] args) {
		int[][] array = {{3, 5, 9}, {2, 11, 5}, {8, 30, 10}, {22, 5, 1}};
		int sum = 0;
		
		for(int i = 0 ; i < 4 ; i++) {
			for(int j = 0; j < 3; j++) {
				sum += array[i][j];
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(sum);
		
	}
}
