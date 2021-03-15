package org.obrii.mit.dp2021.jurilents.laba3.db;

import org.obrii.mit.dp2021.jurilents.Config;
import org.obrii.mit.dp2021.jurilents.laba3.data.IData;
import org.obrii.mit.dp2021.jurilents.laba3.db.annotations.*;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.DataFormatException;

public class PostgresqlDbProvider<TData extends IData> implements IDbProvider<TData> {

    private final Logger logger;
    private Connection connection;
    private Statement statement;
    private String tablename;
    private String valueNames;
    private final TData instance;

    public PostgresqlDbProvider(TData instance) throws DataFormatException, SQLException {
        this.instance = instance;
        this.logger = Logger.getLogger(FileDbProvider.class.getName());
        this.connect();

        this.logger.log(Level.INFO, "Opened database successfully");

        this.createTable();
    }

    @Override
    public void create(TData addingData) {
        System.out.println(addingData);
        String query = String.format("INSERT INTO %s (%s) VALUES (%s);",
                tablename, valueNames, addingData.getValues());
        this.sql(query);
    }

    @Override
    public List<TData> read() {
        try {
            String query = String.format("SELECT * FROM %s;", this.tablename);
            ResultSet rs = this.statement.executeQuery(query);
            List<TData> result = new ArrayList<>();

            while (rs.next()) {
                result.add((TData) this.instance.parse(rs));
            }

            return result;
        } catch (SQLException e) {
            System.out.println("SQL EXCEPTION!");
            this.logger.log(Level.WARNING, e.toString());
            return new ArrayList<>();
        }
    }

    @Override
    public void update(int oldId, TData updatingData) {
        String query = String.format("UPDATE %s SET (%s) WHERE id=%d;",
                tablename, updatingData.getKeysAndValues(), oldId);
        this.sql(query);
    }

    @Override
    public void delete(int id) {
        String query = String.format("DELETE FROM %s WHERE id = %d;", this.tablename, id);
        this.sql(query);
    }


    public void closeConnection() throws SQLException {
        this.statement.close();
        this.connection.close();
    }

    private void sql(String query) {
        try {
            statement.executeUpdate(query);
            this.connection.commit();
        } catch (Exception e) {
            System.out.println("SQL EXCEPTION!");
            System.out.println("QUERY: " + query);
            System.out.println("------------------");
            e.printStackTrace();
            System.out.println("------------------");
        }
    }


    private void connect() {
        try {
            Class.forName("org.postgresql.Driver");
            String url = String.format("%s://%s/%s", Config.getDbProvider(), Config.getDbHost(), Config.getDbName());
            this.connection = DriverManager.getConnection(url, Config.getDbUser(), Config.getDbPass());
            this.connection.setAutoCommit(false);
            this.statement = this.connection.createStatement();
        } catch (Exception e) {
            System.out.println("Connection exception!");
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(1);
        }
    }

    private void createTable() throws DataFormatException, SQLException {
        Class<TData> dataType = (Class<TData>) this.instance.getClass();

        DbTable table = dataType.getAnnotation(DbTable.class);
        this.tablename = table.name();

        List<String> names = new ArrayList<>();
        List<String> fieldQueries = new ArrayList<>();

        for (Field fieldType : dataType.getDeclaredFields()) {
            if (fieldType.isAnnotationPresent(DbField.class)) {
                DbField field = fieldType.getAnnotation(DbField.class);
                fieldQueries.add(String.format("%s %s", field.name(), field.opts()));
                names.add(field.name());
            }
        }

        if (fieldQueries.size() == 0) {
            this.logger.log(Level.WARNING, "The specified fields were not found in the registered table  " + tablename);
            throw new DataFormatException();
        }

        this.valueNames = String.join(", ", names);

        this.statement.execute(buildTableCreateQueryString(fieldQueries));
        this.connection.commit();
    }

    private String buildTableCreateQueryString(List<String> fieldQueries) {
        String fields = String.join(", ", fieldQueries);

        String sql = String.format("CREATE OR REPLACE FUNCTION create_table()\n" +
                "  RETURNS void\n" +
                "  LANGUAGE plpgsql AS\n" +
                "$func$\n" +
                "BEGIN\n" +
                "   IF EXISTS (SELECT FROM pg_catalog.pg_tables WHERE tablename='%s') THEN\n" +
                "      RAISE NOTICE 'Table %s already exists.';\n" +
                "   ELSE\n" +
                "      CREATE TABLE %s (%s);\n" +
                "   END IF;\n" +
                "END\n" +
                "$func$;" +
                "SELECT create_table();", tablename, tablename, tablename, fields);

        return sql;
    }
}