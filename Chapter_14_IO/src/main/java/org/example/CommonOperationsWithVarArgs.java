package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CommonOperationsWithVarArgs {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("F:\\root\\parent\\child\\file2.txt.txt");
        Path copiedPath = Path.of("F:\\root\\parent\\copiedfile.txt.txt");
        Path movedPath = Path.of("F:\\root\\moved.txt.txt");
        System.out.println("Path exists with no symlinks? " + Files.exists(path, LinkOption.NOFOLLOW_LINKS));

        Files.copy(path, copiedPath, LinkOption.NOFOLLOW_LINKS,
                StandardCopyOption.COPY_ATTRIBUTES, StandardCopyOption.REPLACE_EXISTING);

        Files.move(copiedPath, movedPath, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
    }
}
