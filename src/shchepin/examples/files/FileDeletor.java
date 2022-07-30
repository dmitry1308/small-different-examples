package shchepin.examples.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDeletor {
    private String dir;
    private String file;

    public FileDeletor(String dir, String file) {
        this.dir = dir;
        this.file = file;
    }

    public void delete() {
        try {
            Files.delete(Paths.get(dir,file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
