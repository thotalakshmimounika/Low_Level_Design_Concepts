package Interface;

public class PhonePeClient {
    public static void main(String[] args) {
        OpenBankingAPI openBankingAPI = new YesbankApi();
        openBankingAPI.CheckBalanace();
        openBankingAPI.TransferMoney("Alok", "Mounika", 8000.8);
    }
}
