package multidimensionalArrays;

import java.util.Scanner;

public class P01compareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputDimensions = scanner.nextLine().split("\\s+");

        int firstRows = Integer.parseInt(inputDimensions[0]);
        int firstCols = Integer.parseInt(inputDimensions[1]);

        int[][] firstMatrix = new int[firstRows][firstCols];

        for (int i = 0; i < firstRows; i++) {
            String[] parts = scanner.nextLine().split("\\s+");

            for (int j = 0; j < firstCols; j++) {
                firstMatrix[i][j] = Integer.parseInt(parts[j]);
            }
        }

        inputDimensions = scanner.nextLine().split("\\s+");
        int secondRows = Integer.parseInt(inputDimensions[0]);
        int secondCols = Integer.parseInt(inputDimensions[1]);

        int[][] secondMatrix = new int[secondRows][secondCols];

        for (int k = 0; k < secondRows; k++) {
            String[] parts = scanner.nextLine().split("\\s+");

            for (int l = 0; l < secondCols; l++) {
                secondMatrix[k][l] = Integer.parseInt(parts[l]);
            }
        }

        if (firstRows != secondRows || firstCols != secondCols) {
            System.out.println("not equal");
            return;
        }
        for (int i = 0; i < firstRows; i++) {
            for (int j = 0; j < firstCols; j++) {
                if (firstMatrix[i][j] != secondMatrix[i][j]) {
                    System.out.println("not equal");
                    return;
                }
            }
        }
        System.out.println("equal");
    }
}
