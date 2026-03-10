package task2;
import java.util.UUID;

abstract public class Account {
    private String fullName;
    private final long accountNumber;
    private final UUID id;
    private long balance;
    private static int numOfAccounts;

    protected Account(String fullName, long accountNumber) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.id = UUID.randomUUID();
        numOfAccounts++;
    }

    protected Account() {
        this("Default",123456);
    }

    public abstract String getAccountType();


    @Override
    public String toString(){
        return "Bank Account {\n" + this.accountNumber +"\nFor User:" + this.fullName + "\nUUID:" + this.id+"\n}";
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public UUID getId() {
        return id;
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(long amount) {
        this.balance += amount;
    }

    public void withdraw(long amount) {
        if (amount < 0 || amount > balance) throw new IllegalArgumentException("...");
        this.balance -= amount;
    }

    public static int getNumOfAccounts() {
        return numOfAccounts;
    }
}
