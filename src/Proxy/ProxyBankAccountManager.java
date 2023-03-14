package Proxy;

public class ProxyBankAccountManager implements BankAccountManager {
    private RealBankAccountManager realBankAccountManager;
    private String username;
    private String password;

    public ProxyBankAccountManager(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void displayAccountInfo(String accountNumber) {
        if (realBankAccountManager == null) {
            realBankAccountManager = new RealBankAccountManager(username, password);
        }

        if (username.equals(realBankAccountManager.getUsername()) && password.equals(realBankAccountManager.getPassword())) {
            realBankAccountManager.displayAccountInfo(accountNumber);
        } else {
            System.out.println("Truy cập bị từ chối!");
        }
    }
}
