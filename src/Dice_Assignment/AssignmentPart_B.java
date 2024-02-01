package Dice_Assignment;
import java.util.Arrays;
public class AssignmentPart_B {

	public static void main(String[] args) {
        int[] dieA = {1, 2, 3, 4, 5, 6};
        int[] dieB = {1, 2, 3, 4, 5, 6};
        int[][] matrix = new int[6][6];
        for (int i : dieA) {
            for (int j : dieB) {
                matrix[i-1][j-1] = i+j;
            }
        }
        int[] freq = new int[11];
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i + j != 7) {
                    freq[i+j-2]++;
                }
            }
        }
        double[] prob = new double[11];
        for (int i = 0; i < 11; i++) {
            prob[i] = (double)freq[i] / 36;
        }
        double[] newDieA = new double[6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (dieA[i] + dieA[j] != 7) {
                    newDieA[dieA[i]-1] += prob[dieA[i]+dieA[j]-2];
                }
            }
        }
        double maxVal = Arrays.stream(newDieA).max().getAsDouble();
        if (maxVal > 4) {
            for (int i = 0; i < 6; i++) {
                newDieA[i] = 4 * newDieA[i] / maxVal;
            }
        }
        int[] newDieB = new int[6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                newDieB[i] += dieB[j] * newDieA[i];
            }
        }
        System.out.println("New Die A: " + Arrays.toString(newDieA));
        System.out.println("New Die B: " + Arrays.toString(newDieB));
    }

}
