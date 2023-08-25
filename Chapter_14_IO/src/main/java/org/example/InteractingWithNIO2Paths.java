package org.example;

import java.nio.file.Path;

public class InteractingWithNIO2Paths {

    public static void main(String[] args) {
        Path path = Path.of("whale");
        path.resolve("krill");
        System.out.println(path);

        System.out.println(Path.of("/1Z0-829/../Chapter_14_IO").getParent().normalize().toAbsolutePath());

        Path filePath = Path.of("F:\\root\\parent\\child\\file2.txt.txt");
        System.out.println(filePath);

        for(int i=0; i<filePath.getNameCount(); i++) {
            System.out.println(filePath.getName(i));
        }
    }
}
