package chapter9;

/**
 *
 * @author Mohammad Asif
 */
public class Chapter9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       Stock stock=new Stock("ORCL", "Oracle Corporation");
//       stock.set_currentPrice(34.35);
//       stock.set_previousClosingPrice(34.5);
//        System.out.println(stock.getChangePercent());

    stopwatch st=new stopwatch();
//        st.start();
        int[] a=new int[1000];
        for (int i = 0; i < a.length; i++) {
            a[i]=(int)(Math.random()*10);
        }
//        st.stop();
//        System.out.println("the elapsed time for initializing "+st.getElapsedTime());
        
        st.start();
        for (int i = 0; i <a.length; i++) {
            for (int j = i+1; j <a.length; j++) {
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        st.stop();
        System.out.println("The elapsed time for sorting "+st.getElapsedTime());
        System.out.println("hi");
    }
}
