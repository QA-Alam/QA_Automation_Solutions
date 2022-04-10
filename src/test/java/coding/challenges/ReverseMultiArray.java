package coding.challenges;

public class ReverseMultiArray {

	public static void reverseMultiArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = (array[0].length) - 1; j >= 0; j--) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}

	}

	public static void main(String[] args) {
		int array[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		reverseMultiArray(array);

	}

}
