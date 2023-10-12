import ru.gb.sem1.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
//        System.out.println("Hello world!");
        String hello = "Hello, world!";

        FileWriterToWorkingDirectory.WriteToWorkingDirectory(hello, "Hello.txt");
        FileReaderFromWorkingDirectory.ReadThisFile("Hello.txt");

    }
}
