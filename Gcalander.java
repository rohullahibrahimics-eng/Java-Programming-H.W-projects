package chapter9;
import java.util.GregorianCalendar;
class Gcalander {
    public static void main(String[] args){
        GregorianCalendar gc=new GregorianCalendar();
        gc.setTimeInMillis(1234567898765L);
        System.out.println(gc.get(GregorianCalendar.YEAR)+" , "+(gc.get(GregorianCalendar.MONTH)+1)+" , "+gc.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
