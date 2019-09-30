import java.util.Scanner;

public class ArraysKeyValue {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ROWS = 2;
        final int NUM_COLS = 2;
        int [][] milesTracker = new int[NUM_ROWS][NUM_COLS];
        int i;
        int j;
        int maxMiles; // Assign with first element in milesTracker before loop
        int minMiles; // Assign with first element in milesTracker before loop

        for (i = 0; i < milesTracker.length; i++){
            for (j = 0; j < milesTracker[i].length; j++){
                milesTracker[i][j] = scnr.nextInt();
            }
        }

        minMiles = Integer.MAX_VALUE;
        maxMiles = 0;
        for (i = 0; i < milesTracker.length; i++){
            for (j = 0; j < milesTracker[i].length; j++){
                int currentMiles = milesTracker[i][j];
                if (currentMiles < minMiles) {
                    minMiles = currentMiles;
                }
                if (currentMiles > maxMiles) {
                    maxMiles = currentMiles;
                }
            }
        }

        System.out.println("Min miles: " + minMiles);
        System.out.println("Max miles: " + maxMiles);
    }
}