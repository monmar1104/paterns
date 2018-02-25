package pl.codeleak.patterns.facade;

import java.sql.Connection;

public class MySqlHelper {
    public static Connection getMySqlConnection() {
        System.out.println("getting MySql DB connection..");
        return null;
    }

    public void generateMySqlReport(String tableName, Connection connection) {
        System.out.println("generating MySql DB report...");
    }
}
