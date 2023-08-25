package org.example;

import java.io.IOException;
import java.nio.file.Path;

public class NormalizingPaths {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("F:\\root\\parent\\child\\file2.txt.txt");
        System.out.println(path.normalize());

        Path path1 = Path.of("F:\\root\\parent\\..\\file2.txt.txt");
        System.out.println(path1.normalize());

        Path path2 = Path.of("F:\\root\\parent\\..\\..\\file2.txt.txt");
        System.out.println(path2.normalize());

        Path path3 = Path.of("F:\\..\\..\\file2.txt.txt");
        System.out.println(path3.normalize());

        var p3 = Path.of("..\\..\\file2.txt.txt");
        System.out.println(p3.normalize());

        var p4 = Path.of(".\\src\\main\\java\\org\\example\\NormalizingPaths.java");
        System.out.println(p4.toRealPath());

    }
}
