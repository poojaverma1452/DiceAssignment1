package Dice_Assignment;
import java.util.*;
public class AssignmentPart_A2 {

	public static void main(String[] args) {
        int[] dieA = {1, 2, 3, 4, 5, 6};
        int[] dieB = {1, 2, 3, 4, 5, 6};
        int[][] matrix = new int[6][6];
        for (int i = 0; i < dieA.length; i++) {
            for (int j = 0; j < dieB.length; j++) {
                if (dieA[i] + dieB[j] == 7) {
                    continue;
                }
                matrix[i][j] = dieA[i] + dieB[j];
            }
        }
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

}
