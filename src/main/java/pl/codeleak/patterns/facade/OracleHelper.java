package pl.codeleak.patterns.facade;

import java.sql.Connection;

public class OracleHelper {
    public static Connection getOracleConnection() {
        System.out.println("getting Oracle DB connection..");
        return null;
    }

    public void generateOracleReport(String tableName, Connection connection) {
        System.out.println("generating Oracle DB report...");
    }
}
