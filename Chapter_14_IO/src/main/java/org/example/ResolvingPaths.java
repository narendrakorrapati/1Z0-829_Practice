package org.example;

import java.nio.file.Path;

public class ResolvingPaths {

    public static void main(String[] args) {
        Path path1 = Path.of("..\\parent\\..\\");
        Path path2 = Path.of("child\\file2.txt.txt");
        System.out.println(path1.resolve(path2));

        Path path3 = Path.of("..\\parent\\..\\");
        Path path4 = Path.of("F:\\root");
        System.out.println(path3.resolve(path4));

        System.out.println(path4.resolve(path3));
    }
}
