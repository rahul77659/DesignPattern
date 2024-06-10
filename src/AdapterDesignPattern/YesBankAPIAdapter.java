package AdapterDesignPattern;

import AdapterDesignPattern.ThirdPartyAPI.YesBankAPI;

public class YesBankAPIAdapter implements BankAPIAdapter {
    private YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public double getBalance(String accountNumber) {
        // yesBankAPI.fetchBalance();
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}