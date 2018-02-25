package pl.codeleak.patterns.facade;

import java.sql.Connection;

public class HelperDBFacade {
    public static void generateReport(DBType dbType, String tableName) {
        switch (dbType) {
            case MYSQL:
                generateMySqlReport(tableName);
                break;
            case ORACLE:
                generateOracleReport(tableName);
                break;
            default:
                throw new IllegalArgumentException("Unknown DB type");
        }
    }

    private static void generateMySqlReport(String tableName) {
        Connection connection = MySqlHelper.getMySqlConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlReport(tableName, connection);
    }

    private static void generateOracleReport(String tableName) {
        Connection connection1 = OracleHelper.getOracleConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOracleReport(tableName, connection1);
    }
}
