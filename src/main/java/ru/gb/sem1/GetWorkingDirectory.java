package ru.gb.sem1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class GetWorkingDirectory {
    public static Path getWorkingDirectory(){
        Path currentPath = Paths.get(System.getProperty("user.dir"));
//        Path filePath = Paths.get(currentPath.toString(), "outputFile.txt");
        return currentPath;
    }
}
