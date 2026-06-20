package testcircle;
public class testTV {
      public static void main(String[] args) {
        tv tv1=new tv();
        tv1.turnOn();
        tv1.setChannel(8);
        System.out.println("The channel "+tv1.getchannel());
        
        
        tv tv2=new tv();
        tv2.turnOn();
        tv2.setvolum(125);
          System.out.println("The volum "+tv2.getvolum());
      }
}
