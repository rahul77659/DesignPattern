package AdapterDesignPattern;

import Adapter.thirdParty.YesBankAPI;

public class YesBankAPIAdapter implements BankAPIAdapter{
    private YesBankAPI yesBankAPI;

    public YesBankAPIAdapter(YesBankAPI yesBankAPI) {
        this.yesBankAPI = new YesBankAPI();
    }
    @Override
    public String transfer(String toUserName, String fromUserName, double amount) {
        char result = yesBankAPI.transfer(toUserName, fromUserName, (int)amount);
        if(result == 'D')
            return "Success";
        else
            return "Failure";
    }

    @Override
    public double checkBalance(String userName) {
        return yesBankAPI.checkBalance(userName);
    }

    @Override
    public boolean authenticate(String userName) {
        return yesBankAPI.authenticate(userName) == 'Y';
    }
}
