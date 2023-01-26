package multidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06printDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][];

        for (int row = 0; row < size; row++) {
            String[] columData = scanner.nextLine().split(" ");

//            int[] currentRow = new int[size];
//            for (int col = 0; col < columData.length; col++) {
//                currentRow[col] = Integer.parseInt(columData[col]);
//            }
            int [] currentRow = Arrays.stream(columData)
                    .mapToInt(elem -> Integer.parseInt(elem))
                    .toArray();

            matrix[row] = currentRow;
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
        
        for (int row = size - 1, col = 0; col < size; row--, col++) {
            System.out.print(matrix[row][col] + " ");
        }
    }
}
