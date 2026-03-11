package task2;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){

        List<Account> accounts = new ArrayList<>();
        accounts.add(new BankAccountv2("SM",1234));
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
}