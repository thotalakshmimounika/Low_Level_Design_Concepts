package SingletonDesignPattern.Practicse;

public class DBconn { //following Singleton pattern
    private int noOfConn = 0;
    private final int limit = 10;
    private static DBconn instance; // store address to DBConn object in heap

    private DBconn(){}

    public static DBconn getDBConnObject(){ // return a reference variable, that stores address to DBCOnnec object in heap
        if(instance == null){
            instance = new DBconn();
        }
        return instance;
    }

    public boolean connect(){
        if(noOfConn < limit){
            noOfConn++;
            return true;
        }else {
            return false;
        }
    }
}
// variable -> int x;
// Car c = new Car();
// Car c; ->