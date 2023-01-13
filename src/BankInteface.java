public interface BankInteface {
    double checkBalance();
    String addMoney(int amount);

    String withMoney(int amount, String password);
    double calculateInterest(int years);
}
