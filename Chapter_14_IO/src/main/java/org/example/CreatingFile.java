package org.example;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatingFile {

    public static void main(String[] args) {

        File zooFile1 = new File("F:\\root\\parent\\child\\file2.txt.txt");
        File zooFile2 = new File("F:\\root\\parent\\", "child\\file2.txt.txt");
        File parent = new File("F:\\root\\parent\\");
        File zooFile3 = new File(parent, "child\\file2.txt.txt");

        System.out.println(zooFile1.exists());
        System.out.println(zooFile2.exists());
        System.out.println(zooFile3.exists());

        Path zooPath1 = Path.of("F:\\root\\parent\\child\\file2.txt.txt");
        Path zooPath2 = Path.of("F:\\root", "parent", "child", "file2.txt.txt");

        Path zooPath3 = Paths.get("F:\\root\\parent\\child\\file2.txt.txt");
        Path zooPath4 = Paths.get("F:\\root", "parent", "child", "file2.txt.txt");

        System.out.println(Files.exists(zooPath1));
        System.out.println(Files.exists(zooPath2));
        System.out.println(Files.exists(zooPath3));
        System.out.println(Files.exists(zooPath4));

        //Switching between File and Path

        Path fromFile = zooFile1.toPath();
        File fromPath = fromFile.toFile();

        System.out.println(Files.exists(fromFile));
        System.out.println(fromPath.exists());

        //Obtaining Path from FileSystems class

        Path fileSystemPath1 = FileSystems.getDefault().getPath("F:\\root\\parent\\child\\file2.txt.txt");
        Path fileSystemPath2 = FileSystems.getDefault().getPath("F:\\root", "parent", "child", "file2.txt.txt");

        System.out.println(Files.exists(fileSystemPath1));
        System.out.println(Files.exists(fileSystemPath2));
    }
}
