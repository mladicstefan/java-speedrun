package task2;


import task3.InsufficientFundsException;
import task3.InvalidAmountException;

public class BankAccountv2 extends Account implements Transferable{

    public BankAccountv2(String fullName, long accountNumber) {
        super(fullName, accountNumber);
    }

    public BankAccountv2(){ super(); }

    @Override
    public String getAccountType() {
        return "Bank Account";
    }

    @Override
    public void transfer(long amount, Account target) {

        try{
          this.withdraw(amount);
        }catch (InsufficientFundsException e){
            System.out.println(e);
            return;
        }catch (InvalidAmountException e){
            System.out.println(e);
            return;
        }finally{
            System.out.println("Done");
        }
        target.deposit(amount);
    }

}
