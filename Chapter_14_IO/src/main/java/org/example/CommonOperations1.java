package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class CommonOperations1 {

    public static void main(String[] args) throws IOException {
        File file = new File("F:\\root\\parent\\child\\file2.txt.txt");
        Path path = Path.of("F:\\root\\parent\\child\\file2.txt.txt");

        System.out.println("File name: " + file.getName());
        System.out.println("Path name: " + path.getFileName());

        System.out.println("File parent: " + file.getParent());
        System.out.println("Path parent: " + path.getParent());

        System.out.println("File isAbsolute: " + file.isAbsolute());
        System.out.println("Path isAbsolute: " + path.isAbsolute());

        File deleteFile = new File("F:\\root", "parent\\child\\delete-test-file.txt");
        Path deletePath = Path.of("F:\\root", "parent", "child", "delete-test-path.txt");

        if(deleteFile.exists() && deleteFile.isFile()) {
            deleteFile.delete();
        }

        System.out.println("Delete file exists? " + deleteFile.exists());

        if(Files.isRegularFile(deletePath)) {
           Files.deleteIfExists(deletePath);
        }

        System.out.println("Delete path exists? " + Files.exists(deletePath));

        System.out.println("File absolute path: " + file.getAbsolutePath());
        System.out.println("Path absolute path: " + path.toAbsolutePath());

        File dirFile = new File(file.getParent());
        Path dirPath = path.getParent();

        System.out.println("Is Dir? " + dirFile.isDirectory());
        System.out.println("Is path Dir? " + Files.isDirectory(dirPath));

        System.out.println("File last modified: " + file.lastModified());
        System.out.println("Path last modified: " + Files.getLastModifiedTime(path));

        System.out.println("File size: " + file.length());
        System.out.println("Path size: " + Files.size(path));

        Arrays.stream(dirFile.listFiles()).forEach(System.out::println);
        Files.list(dirPath).forEach(System.out::println);

        File dirToCreate = new File("F:\\root", "fileDir\\child");
        Path pathToCreate = Path.of("F:\\root\\pathDir\\child");

        if(!dirToCreate.exists()) {
            dirToCreate.mkdirs();
        }

        if(!Files.exists(pathToCreate)) {
            Files.createDirectories(pathToCreate);
        }

        File fileRename = new File("F:\\root", "renameByFile");
        Path pathRename = Paths.get("F:\\root", "renameByPath");

        if(fileRename.exists() && fileRename.isDirectory()) {
            fileRename.renameTo(new File("F:\\root\\renamedByFile"));
        }

        if(Files.exists(pathRename) && Files.isDirectory(pathRename)) {
            Files.move(pathRename, Path.of("F:\\root\\renamedByPath"));
        }
    }
}
