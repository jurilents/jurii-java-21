package org.obrii.mit.dp2021.jurilents;

public class Config {
    private static final String fileName = "super-secret.database.bin";

    private static String dbPath = null;

    public static String getFileName() {
        return dbPath;
    }

    public static void setFileName(String path) {
        dbPath = path + fileName;
    }
}
