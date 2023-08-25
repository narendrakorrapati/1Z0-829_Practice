package org.example;

import java.nio.file.Path;

public class AccessingPathElements {

    public static void main(String[] args) {
        printPathInformation(Path.of("file2.txt.txt"));
        printPathInformation(Path.of("F:\\root\\parent\\child\\file2.txt.txt"));
        printPathInformation(Path.of(".\\..\\parent\\..\\file2.txt.txt"));
        printPathInformation(Path.of(".\\..\\parent\\..\\.\\file2.txt.txt"));
    }

    static void printPathInformation(Path path) {
        System.out.println("File name is : " + path.getFileName());
        System.out.println("Root is : " + path.getRoot());
        Path currentParent = path;
        while((currentParent = currentParent.getParent())!=null) {
            System.out.println(currentParent);
        }
        System.out.println();
    }
}
