package Dice_Assignment;

public class AssignmentPart_A3 {

	public static void main(String[] args) {
        int[] dieA = {1, 2, 3, 4, 5, 6};
        int[] dieB = {1, 2, 3, 4, 5, 6};
        int[][] matrix = new int[6][6];
        for (int i : dieA) {
            for (int j : dieB) {
                if (i + j == 7) {
                    continue;
                }
                matrix[i-1][j-1] = i+j;
            }
        }
        for (int i = 2; i <= 12; i++) {
            int count = 0;
            for (int[] row : matrix) {
                for (int cell : row) {
                    if (cell == i) {
                        count++;
                    }
                }
            }
            System.out.printf("Sum: %d, Probability: %.2f%%\n", i, (double)count/36*100);
        }
    }

}
