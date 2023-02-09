package streamsFileAndDirectoriesExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class P01sumLines {
    public static void main(String[] args) throws IOException {
        String pathToFile = "C:\\Users\\35989\\OneDrive\\Документи\\SoftUni\\Projects\\BasicWebProject\\Java-Fundamentals-BasicWebProject\\JavaAdvanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> allLines = Files.readAllLines(Path.of(pathToFile));

//        for (String line : allLines) {
//            int sum = 0; //сума от кодовете на символите на този ред
//            for (char symbol : line.toCharArray()) {
//                sum += (int) symbol;
//            }
//            System.out.println(sum);
//        }

        allLines.stream()
                .map(line -> line.toCharArray())
                .forEach(arr -> {
                    int sum = 0;
                    for (char symbol : arr) {
                        sum += (int) symbol;
                    }
                    System.out.println(sum);
                });
    }
}
