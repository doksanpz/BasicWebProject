package streamsFilesAndDirectories;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class P08nestedFolders {
    public static void main(String[] args) {
        String folderPath = "C:\\Users\\35989\\OneDrive\\Desktop\\SoftUni\\Java Advanced\\07.StreamsFilesAndDirectories\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\Files-and-Streams\\Files-and-Streams";

        File file = new File(folderPath);

        Deque<File> dirs = new ArrayDeque<>();
        dirs.offer(file);

        int count = 0;
        while (!dirs.isEmpty()) {
            File current = dirs.poll();
            File[] nestedFiles = current.listFiles();
            for (File nestedFile : nestedFiles)
                if (nestedFile.isDirectory())
                    dirs.offer(nestedFile);
            count++;
            System.out.println(current.getName());
        }
        System.out.println(count + " folders");
    }
}
