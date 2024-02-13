package SingletonDesignPattern.SingleThreaded;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection = null;
    private DatabaseConnection(){}

    public static DatabaseConnection getInstance(){
        if (databaseConnection==null){
            databaseConnection = new DatabaseConnection();
        }
        return databaseConnection;
    }
}
