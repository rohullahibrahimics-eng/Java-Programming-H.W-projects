package chapter9;
public class rectangle {
   private  double wieth=1;
   private double height=1;
    public rectangle(){
    }
    public rectangle(double wieth, double height){
        this.wieth=wieth;
        this.height=height;
    }
    
    public double get_area(){
        return wieth*height;
    }
    public double get_perimeter(){
        return (2*wieth+2*height);
    }
    
}
