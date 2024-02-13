package Interface;

public class RayzorPeClient {
    public static void main(String[] args) {
        OpenBankingAPI openBankingAPI2 = new ICICIBankAPI();
        openBankingAPI2.CheckBalanace();
    }
}
