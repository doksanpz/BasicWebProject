package streamsFileAndDirectoriesExercise;

import java.io.File;

public class P08getFolderSize {
    public static void main(String[] args) {
        String path = "C:\\Users\\35989\\OneDrive\\Документи\\SoftUni\\Projects\\BasicWebProject\\Java-Fundamentals-BasicWebProject\\JavaAdvanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

        File folder = new File(path);

        File[] allFiles = folder.listFiles(); //масив с всички файлове

        int folderSize = 0;

        if (allFiles != null) {
            for (File file : allFiles) {
                folderSize += file.length();
            }
        }

        System.out.println("Folder size: " + folderSize);
    }
}
