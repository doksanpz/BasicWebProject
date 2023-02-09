package streamsFilesAndDirectories;

import java.io.*;

public class P05writeEveryThirdLine {
    public static void main(String[] args) throws FileNotFoundException {
        String basePath = "C:\\Users\\35989\\OneDrive\\Desktop\\SoftUni\\Java Advanced\\07.StreamsFilesAndDirectories\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\Files-and-Streams";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\05_output.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(inputPath));
            PrintWriter writer = new PrintWriter(new FileOutputStream(outputPath))) {

            int lineCount = 1;
            String line = reader.readLine();;

            while (line != null) {
                if (lineCount % 3 == 0) {
                    writer.println(line);
                }
                line = reader.readLine();
                lineCount++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
