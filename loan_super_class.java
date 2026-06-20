/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designing_loan_class;

import java.util.Date;
public  abstract class loan_super_class {

    public loan_super_class() {
    }
     public loan_super_class(double annualIntestrate , int num_year, double loan_amount) {
         this.annual_interst=annualIntestrate;
         this.n_year=num_year;
         this.loanamount=loan_amount;
         loan_date=new Date();
    }

    public void setAnnual_interst(double annual_interst) {
        this.annual_interst = annual_interst;
    }

    public void setN_year(int n_year) {
        this.n_year = n_year;
    }

    public void setLoanamount(double loanamount) {
        this.loanamount = loanamount;
    }

    public void setLoan_date(Date loan_date) {
        this.loan_date = loan_date;
    }

    public double getAnnual_interst() {
        return annual_interst;
    }

    public int getN_year() {
        return n_year;
    }

    public double getLoanamount() {
        return loanamount;
    }

    public Date getLoan_date() {
        return loan_date;
    }
    public abstract double monthly_pay();
    
    public double get_total_pay(){
        return ((this.loanamount*this.n_year*this.annual_interst)/100);
    }
    private double annual_interst=2.5;
    private  int n_year=1;
    private double loanamount=1000;
    private Date loan_date=null;
    
    
    
    
    
}
