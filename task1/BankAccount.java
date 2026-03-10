package task1;
import java.util.UUID;

public class BankAccount {
    private String fullName;
    private final long accountNumber;
    private final UUID id;
    private long balance;
    private static int numOfAccounts;


    public BankAccount(String fullName, long accountNumber) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.id = UUID.randomUUID();
        numOfAccounts++;
    }

    public BankAccount() {
        this("Default",123456);
    }

    @Override
    public String toString(){
        return "Bank Account{\n" + this.accountNumber +"\nFor User:" + this.fullName + "\nUUID:" + this.id+"\n}";
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getBalance() {
        return balance;
    }

    public void withdraw(long amount){
        this.balance-=amount;
    }

    public void deposit(long amount){
        this.balance+=amount;
    }
    public long getAccountNumber() {
        return accountNumber;
    }

   public static int getNumOfAccounts(){
       return numOfAccounts;
   }

    public String getId() {
        return id.toString();
    }
}
