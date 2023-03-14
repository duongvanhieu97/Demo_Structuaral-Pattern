package Proxy;

public class RealBankAccountManager implements BankAccountManager {
    private String username;
    private String password;

    public RealBankAccountManager(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void displayAccountInfo(String accountNumber) {
        System.out.println("Displaying account information for account number: " + accountNumber);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
