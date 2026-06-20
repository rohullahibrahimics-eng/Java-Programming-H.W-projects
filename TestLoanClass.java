/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designing_loan_class;

/**
 *
 * @author Mohammad Asif
 */
public class TestLoanClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double anulainterst=10;
        int num=100;
        double loan_amount=10000;
        loan_super_class loan=new loan_super_class(anulainterst,num,loan_amount) {
            @Override
            public double monthly_pay() {
                return 1000;
            }
        };
    }
}
