package Interface;

    public interface OpenBankingAPI {
        void CheckBalanace();
        void TransferMoney(String from, String To, double Amount);
    }
