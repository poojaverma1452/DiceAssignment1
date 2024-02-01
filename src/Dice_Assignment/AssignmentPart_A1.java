package Dice_Assignment;
public class AssignmentPart_A1 {
    public static void main(String[] args) {
        int[] dieA = {1, 2, 3, 4, 5, 6};
        int[] dieB = {1, 2, 3, 4, 5, 6};
        for (int i : dieA) {
            for (int j : dieB) {
                if (i + j == 7) {
                    continue;
                }
                System.out.printf("Die A: %d, Die B: %d, Sum: %d\n", i, j, i+j);
            }
        }
    }
}
