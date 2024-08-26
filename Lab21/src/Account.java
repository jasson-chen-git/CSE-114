/*
    Lab 21
    Jason Chen
    112515450
 */
import java.lang.invoke.LambdaMetafactory;
import java.util.Date;
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    final private Date dateCreated;
    Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    Account(){
        this(0, 0.0);
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public int getId() {
        return id;
    }
    public double getBalance() {
        return balance;
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public Date getDateCreated() {
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }
    public void withdraw(double amount){
        if(balance < amount){
            System.out.println("Amount cannot be withdrawn");
        }
        else{
            System.out.println("$" + amount + " withdrawn.");
            balance -= amount;
        }
    }
    public void deposit(double amount){
        System.out.println("$" + amount + " deposited.");
        balance += amount;
    }
    public void printAccountDetails(){
        System.out.println("************************************************");
        System.out.println("Account ID: \t\t" + id);
        System.out.println("Account Created: \t" + dateCreated);
        System.out.println("Current Balance: \t" + balance);
        System.out.println("************************************************");
    }
}
class test {
    public static void main(String[] args){
        Account A = new Account(1122, 20000);
        A.printAccountDetails();
        A.setAnnualInterestRate(4.5);
        A.withdraw(2500);
        A.deposit(3000);
        A.printAccountDetails();
    }
}
