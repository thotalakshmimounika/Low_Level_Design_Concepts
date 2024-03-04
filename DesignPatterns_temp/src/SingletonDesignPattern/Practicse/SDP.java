package SingletonDesignPattern.Practicse;

public class SDP {
    public static SDP instance;
    private SDP(){

    }
    public static SDP createinstance(){
        if(instance==null){
            instance = new SDP();
        }
        return instance;
    }
}
