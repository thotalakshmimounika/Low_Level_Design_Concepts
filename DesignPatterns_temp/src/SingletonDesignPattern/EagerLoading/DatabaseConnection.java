package SingletonDesignPattern.EagerLoading;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection = new DatabaseConnection();
    private DatabaseConnection(){}
    public static DatabaseConnection getInstance(){
        if (databaseConnection==null){
            databaseConnection = new DatabaseConnection();
        }
        return databaseConnection;
    }


}
