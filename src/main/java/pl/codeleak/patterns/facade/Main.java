package pl.codeleak.patterns.facade;

public class Main {
    public static void main(String[] args) {
        // TODO stwórz fasadę, która umożliwi korzystanie z połączeń i generowanie raportów na podstawie zadanego typu
        // np. DBType.MYSQL, DBType.ORACLE
        String tableName = "tableName";

        HelperDBFacade.generateReport(DBType.MYSQL, tableName);
        HelperDBFacade.generateReport(DBType.ORACLE, tableName);
    }
}
