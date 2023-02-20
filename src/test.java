import java.util.Scanner;

public class test {
    public static void main (String[] args)

    {
        final int NUM_STUDENTS = 25;

        final int NUM_ASSINGMENTS = 30;

        int i, j;//counter variables

        String[] studentNames = new String[NUM_STUDENTS];

        int[][] assignmentScores = new int[NUM_STUDENTS][NUM_ASSINGMENTS];

        Scanner scnr = new Scanner(System.in);

        for(i = 0; i < NUM_STUDENTS; i++) {

            studentNames[i] = scnr.next();

            for (j = 0; j < i; j++) {

                assignmentScores[i][j] = nextInt();

            }

        }
    }

    private static int nextInt() {
        return 0;
    }
}
