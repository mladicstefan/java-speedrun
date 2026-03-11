package task2;


public class SavingsAccount extends BankAccountv2 implements InterestBearing, Comparable<SavingsAccount> {
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

    @Override
    public int compareTo(SavingsAccount o){
        return Double.compare(this.getBalance(),o.getBalance());
    }
}
