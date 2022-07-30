package shchepin.examples.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path1 = Path.of("c:\\example");

        try (DirectoryStream<Path> files = Files.newDirectoryStream(path1)) {
            for (Path path2 : files)
                System.out.println(path2);
        }

        String dir = "C:/example/exampleTestDir/";
        String file = "testFile";
        new FileCreator(dir, file).create();

        new FileDeletor(dir, file).delete();

    }
}
