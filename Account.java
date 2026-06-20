package chapter9;

import java.util.Date;

public class Account {
    private int id=0;
    private double balance=0;
    private double annualInterestRate=0;
    private Date dateCreated;
    public Account(){
}

    public Account(int id , double balance) {
        Date d=new Date();
       this.id=id;
       this.balance=balance;
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    public double getMonthlyInterestRate(){
        return (annualInterestRate/12);
    }
    
    public void withdraw(double withdraw){
       balance=balance-withdraw;
    }
    
    public void deposit(double deposit){
        balance=balance+deposit;
    }
    
    
     public static void main(String[] args) {
         Account acc=new Account(1221, 20000);
         acc.setAnnualInterestRate(4.5);
         acc.withdraw(2500);
         acc.deposit(3000);
         
         System.out.println("balance"+acc.getBalance());
         System.out.println("monthly interest "+acc.getMonthlyInterestRate());
     
         
         
     }
}
