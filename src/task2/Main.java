package task2;
import task1.BankAccount;

public class Main{

    public static void main(){
        BankAccountv2 b = new BankAccountv2("S M", 12346);
        BankAccountv2 t = new BankAccountv2("A A", 12347);

        b.transfer(500,t);
        System.out.println(t.getBalance());
    }
}