
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account acctMatthew = new Account("Matthews account", 1000);
        Account acctMe = new Account("My account", 0);
        acctMatthew.withdrawal(100);
        acctMe.deposit(100);
        System.out.println(acctMatthew);
        System.out.println(acctMe);
    }
}
