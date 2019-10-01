package com.luxoft.gof.factorymethod.filesystem;

/**
 * Created by Teacher1316 on 6/8/2018.
 */
public class Main {
    public static void main(String[] args) {
        File other = Files.createFile("file", FileSystem.Type.OTHER);
        FileSystem fs = new OtherFS();
        fs.createFile("file");
    }
}
