package pl.codeleak.patterns.facade;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        // TODO stwórz fasadę, która umożliwi korzystanie z połączeń i generowanie raportów na podstawie zadanego typu
        // np. DBTypes.MYSQL, DBTypes.ORACLE
        String tableName = "tableName";

        Connection connection = MySqlHelper.getMySqlConnection();
        MySqlHelper mySqlHelper = new MySqlHelper();
        mySqlHelper.generateMySqlReport(tableName, connection);

        Connection connection1 = OracleHelper.getOracleConnection();
        OracleHelper oracleHelper = new OracleHelper();
        oracleHelper.generateOracleReport(tableName, connection1);
    }
}
