package SingletonDesignPattern.Practicse;

public class SDP_Adv {
    public static SDP_Adv instance;

    private SDP_Adv(){

    }
    public static  SDP_Adv creatinginstance(){
        if(instance==null){
            synchronized (SDP_Adv.instance){
                if(instance==null){
                    instance = new SDP_Adv();
                }
            }
        }
        return instance;
    }

}
