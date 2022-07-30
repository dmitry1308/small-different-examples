package shchepin.examples.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Collections;
import java.util.Set;

public class FileCreator {
    private String pathName;
    private String file;

    public FileCreator(String pathName, String file) {
        this.pathName = pathName;
        this.file = file;
    }


    public void create() {
        File dir = new File(pathName);

        createFileOrDir(dir.mkdirs(), "dir created: ", dir.getAbsolutePath(), "created yet:");

        File file = new File(dir, this.file);
        try {
            createFileOrDir(file.createNewFile(), "file created: ", file.getName(), "created yet:");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void createFileOrDir(boolean mkdirs, String s, String absolutePath, String s2) {
        if (mkdirs) {
            System.out.println(s + absolutePath);
        } else {
            System.out.println(s2 + absolutePath);
        }
    }
}
