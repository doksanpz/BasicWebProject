package examPreparation;

import java.util.Scanner;

public class P02mouseAndCheese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); //брой ребове и колони

        char[][] matrix = new char[n][n];

        // позиция
        int mouseRow = -1; //задаваме невалидни данни
        int mouseCol = -1;
        int countCheese = 0;

        //пълним матрицата
        for (int row = 0; row < n; row++) {
            String rowContent = scanner.nextLine();
            char[] rowSymbols = rowContent.toCharArray();
            matrix[row] = rowSymbols;
        }
        //намираме текущата позиция
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                char currentSymbol = matrix[row][col];
                if (currentSymbol == 'M') {
                    mouseRow = row;
                    mouseCol = col;
                }
            }
        }

        //движим се по матрицата
        String direction = scanner.nextLine();
        while (!direction.equals("end")) {
            matrix[mouseRow][mouseCol] = '-';
            switch (direction) {
                case "up" :
                    mouseRow--;
                    break;
                case "down" :
                    mouseRow++;
                    break;
                case "left" :
                    mouseCol--;
                    break;
                case "right" :
                    mouseCol++;
                    break;
            }
            //проверяваме дали е валидна позицията
            if (mouseCol < 0 || mouseCol >= n || mouseRow < 0 || mouseRow >= n) {
                System.out.println("Where is the mouse?");
                break;
            }

            if (matrix[mouseRow][mouseCol] == 'c') {
                countCheese++;
            } else if (matrix[mouseRow][mouseCol] == 'B') {
                continue;
            }
            matrix[mouseRow][mouseCol] = 'M';

            direction = scanner.nextLine();
        }
        // проверка по условие
        if (countCheese >= 5) {
            System.out.printf("Great job, the mouse is fed %d cheeses!%n", countCheese);
        } else {
            System.out.printf("The mouse couldn't eat the cheeses, she needed %d cheeses more.%n", 5 - countCheese);
        }
        //принтираме матрицата
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
