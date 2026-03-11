import task2.Account;
import task2.BankAccountv2;
import task2.InterestBearing;
import task2.SavingsAccount;
import task3.InsufficientFundsException;
import task3.InvalidAmountException;
import task5.Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main{
    public static void main(String[] args){

        task2();

        List<SavingsAccount> savingsAccounts = new ArrayList<>();
        task3(savingsAccounts);

        task4(savingsAccounts);

        Bank b = Bank.getInstance("City Bank");
        b.addAccount(new BankAccountv2());
        System.out.println(b);

    }

    private static void task4(List<SavingsAccount> savingsAccounts) {
        try{
            for (SavingsAccount s : savingsAccounts){
                s.withdraw(-100);
            }
        }catch (InsufficientFundsException e){
            System.out.println(e);
        }catch (InvalidAmountException e){
            System.out.println(e);
        }finally{

            System.out.println("Done");
        }
    }

    private static void task3(List<SavingsAccount> savingsAccounts) {
        Random r = new Random();

        for (int i = 0; i < 5; i++) {
            SavingsAccount acc = new SavingsAccount();
            acc.deposit(r.nextDouble());
            savingsAccounts.add(acc);

        }

        savingsAccounts.sort(null);
        System.out.println(savingsAccounts);
    }

    private static void task2() {
        List<Account> accounts = new ArrayList<>();
        getAccounts(accounts).add(new BankAccountv2("SM",1234));
        accounts.add(new SavingsAccount());

        for (Account acc : accounts){
            acc.deposit(100);
            if (acc instanceof InterestBearing){
                ((InterestBearing) acc).applyInterest();
                System.out.println("Applied interest to " + acc.getAccountNumber());
            }
            System.out.println(acc.toString());
            System.out.println(acc.getBalance());
        }
    }

    private static List<Account> getAccounts(List<Account> accounts) {
        return accounts;
    }
}