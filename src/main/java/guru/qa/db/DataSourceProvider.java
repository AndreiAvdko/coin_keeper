package guru.qa.db;

import org.postgresql.ds.PGSimpleDataSource;
import javax.sql.DataSource;

public enum DataSourceProvider {
    INSTANCE;

    private PGSimpleDataSource ds;

    public DataSource getDatasource() {
        if (ds == null) {
            ds = new PGSimpleDataSource();
            ds.setServerNames(new String[] {"192.168.0.6"});
            ds.setPortNumbers(new int[] {5432});
            ds.setDatabaseName("coin_keeper");
            ds.setUser("root");
            ds.setPassword("password");
        }
        return (DataSource) ds;
    }

    // Классический вариант Singleton
    /*private static DataSourceProvider INSTANCE;
    private DataSourceProvider() {
    }

    public static DataSourceProvider getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DataSourceProvider();
        }
        return INSTANCE
    }*/
}
