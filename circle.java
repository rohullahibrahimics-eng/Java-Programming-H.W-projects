package testcirclewithstaticmembers;
public class circle {
    circle(int new_radius){
        radius=new_radius;
        number_of_objects++;
    }
   int radius;
      double area;

    public  double getArea() {
        return radius*radius*Math.PI;
    }
    static int number_of_objects=0;
    public  int getRadius(){
        return radius;
    }
    
}
