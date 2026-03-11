package task2;


public class SavingsAccount extends BankAccountv2 implements InterestBearing {
    private double interestRate;

    public SavingsAccount(String fullName, long accountNumber, double interestRate) {
        super(fullName, accountNumber);
        this.interestRate = interestRate;
    }

    public SavingsAccount(){
        super();
        this.interestRate = 0.01;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public double getBalance() {
        return super.getBalance();
    }

    public void applyInterest(){
        this.deposit(this.getBalance() * this.interestRate);
    }

    @Override
    public String getAccountType() {
        return "Savings Account";
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
