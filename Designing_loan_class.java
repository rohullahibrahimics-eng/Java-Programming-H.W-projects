package designing_loan_class;
public class Designing_loan_class extends loan_super_class{
    public static void main(String[] args) {
        System.out.println();
    }

    @Override
    public double monthly_pay() {
     return get_total_pay()/100/12;
    }
    
}
