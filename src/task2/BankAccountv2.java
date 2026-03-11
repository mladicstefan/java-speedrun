package task2;


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
        target.deposit(amount);
        this.withdraw(amount);
    }

}
