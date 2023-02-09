package streamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class P01readFile {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\35989\\OneDrive\\Desktop\\SoftUni\\Java Advanced\\07.StreamsFilesAndDirectories\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\input.txt";

        try (InputStream inputStream = new FileInputStream(filePath)){
            int readByte = inputStream.read();

            while (readByte >= 0) {
                System.out.print(Integer.toBinaryString(readByte) + " ");

                readByte = inputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        InputStream inputStream = new FileInputStream(filePath);
//
//        int firstByte = inputStream.read();
//
//        System.out.println(firstByte);
//        System.out.println((char) firstByte);
//
//        inputStream.close();
    }
}
