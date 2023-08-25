package org.example;

import java.nio.file.Path;

public class CreatingPartOfPath {

    public static void main(String[] args) {
        Path path = Path.of("F:\\root\\parent\\child\\file2.txt.txt");

        for(int i=0; i<path.getNameCount(); i++) {
            System.out.println(path.getName(i));
        }
        System.out.println("Subpaths starts");
        System.out.println(path.subpath(0, 1));
        System.out.println(path.subpath(0, 4));
        System.out.println(path.subpath(1, 3));
        System.out.println(path.subpath(1, 1)); //Exception
    }
}
