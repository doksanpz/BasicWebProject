package streamsFilesAndDirectories;

import java.io.*;

public class P03copyBytes {
    public static void main(String[] args) throws RuntimeException {
        String basePath = "C:\\Users\\35989\\OneDrive\\Desktop\\SoftUni\\Java Advanced\\07.StreamsFilesAndDirectories\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\Files-and-Streams";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\output_3.txt";

        try (InputStream inputStream = new FileInputStream(inputPath);
             OutputStream outputStream = new FileOutputStream(outputPath)) {
            int readByte = inputStream.read();
            while (readByte >= 0) {

                if (readByte == 10 || readByte == 32) {
                    outputStream.write(readByte);
                } else {
                    String number = String.valueOf(readByte);

                    for (int i = 0; i < number.length(); i++) {
                        outputStream.write(number.charAt(i));
                    }
                }

                readByte = inputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
