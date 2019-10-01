package com.luxoft.gof.factorymethod.filesystem;


/**
 * Created by Teacher1316 on 6/8/2018.
 */
public class Files {
    static File createFile(String name, FileSystem.Type fileSystemType) {
        switch (fileSystemType) {
            case WIN:
                return new WinFile(name);
            case OTHER:
                return new OtherFile(name);
        }
        throw new RuntimeException();
    }

    private static class WinFile implements File {
        private final String name;

        private WinFile(String name) {
            this.name = name;
        }

        @Override
        public String name() {
            return name;
        }
    }

    private static class OtherFile implements File {
        private final String name;

        private OtherFile(String name) {
            this.name = name;
        }

        @Override
        public String name() {
            return name;
        }
    }
}
