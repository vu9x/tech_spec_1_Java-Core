package ru.gb.sem1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriterToWorkingDirectory {
//    private String text;
//    private String fileName;
//
//    public void FileWriterToWorkingDirectory(String text, String fileName){
//        this.text = text;
//        this.fileName = fileName;
//    }
//
//    public String getText() {
//        return text;
//    }
//
//    public String getFileName() {
//        return fileName;
//    }
//
//    public void WriteToWorkingDirectory() throws IOException {
//        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
//        writer.write(text);
//
//        writer.close();
//    }

    public static void WriteToWorkingDirectory(String text, String fileName) throws IOException {
//        Path filePath = GetWorkingDirectory.getWorkingDirectory();
//        Path fullPath = Paths.get(filePath.toString(), fileName);
//
//        BufferedWriter writer = new BufferedWriter(new FileWriter(fullPath.toString()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(text);

        writer.close();
    }
}

