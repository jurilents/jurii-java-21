package org.obrii.mit.dp2021.jurilents;

public class Config {

    // FileDB

    private static final String fileName = "super-secret.database.bin";

    private static String dbPath = null;

    public static String getFileName() {
        return dbPath;
    }

    public static void setFileName(String path) {
        dbPath = path + fileName;
    }

    // PostgreSQL

    private static final String dbProvider   = "jdbc:postgresql";
    private static final String dbHostName   = "localhost:5432";
    private static final String databaseName = "java_lab4";
    private static final String dbUserName   = "postgres";
    private static final String dbPassword   = "postgres";

    public static String getDbPath() { return dbPath; }
    public static String getDbProvider() { return dbProvider; }
    public static String getDbHost() { return dbHostName; }
    public static String getDbName() { return databaseName; }
    public static String getDbUser() { return dbUserName; }
    public static String getDbPass() { return dbPassword; }
}
