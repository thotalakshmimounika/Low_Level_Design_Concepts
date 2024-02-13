package SingletonDesignPattern.DoubleCheckingLock;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection = null;
    private DatabaseConnection(){}

    public static DatabaseConnection getInstance(){
        if (databaseConnection==null){// t1,t2 first check without lock
            synchronized (DatabaseConnection.class) { // t1 takes lock
                if (databaseConnection==null){ //Second check after taking lock
                    databaseConnection = new DatabaseConnection();
                }
            }
        }
        return databaseConnection;
    }
}
/*Pros of Singleton design Pattern
1. Resource Efficiency
2. Creating a mutiple new object is not required(shared resouce)

Cons:
1.difficulty in testing the singleton class

Mocking:
creating a replicate and test

*/