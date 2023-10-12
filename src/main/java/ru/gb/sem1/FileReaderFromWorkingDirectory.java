package ru.gb.sem1;

import java.io.FileReader;
import java.util.Scanner;

public class FileReaderFromWorkingDirectory {
    public static void ReadThisFile(String fileName) throws Exception{
        FileReader fr = new FileReader(fileName);
        Scanner scan = new Scanner(fr);

        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
        fr.close();
    }
}
