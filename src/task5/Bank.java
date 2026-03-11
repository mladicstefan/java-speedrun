package task5;

import task2.Account;
import java.util.ArrayList;

public class Bank {
    private static Bank instance;
    private final String IBAN;
    private ArrayList<Account> accounts;

    private Bank(String IBAN){
        this.IBAN= IBAN;
        this.accounts = new ArrayList<>();
    }

    public static Bank getInstance(String IBAN) {
        if (instance == null){
            instance = new Bank(IBAN);
        }

        return instance;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account a){
        this.accounts.add(a);
    }
    public String getISBN() {
        return this.IBAN;
    }

    public static Bank getInstance() {
        return instance;
    }

    public static void setInstance(Bank instance) {
        Bank.instance = instance;
    }

}
