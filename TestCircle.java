package testcircle;
public class TestCircle {
    public static void main(String[] args) {
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Circle circle_first_object= new Circle();
        System.out.println("The area for circle with raduis "+circle_first_object.radius+" is "+circle_first_object.get_area());
        
        Circle cirlce_second_object=new Circle(25);
        System.out.println("The area for circle with raduis "+cirlce_second_object.radius+" is "+cirlce_second_object.get_area());
        
        Circle circle_third_object=new Circle(50);
        System.out.println("The area for circle with raduis "+circle_third_object.radius+" is "+circle_third_object.get_area());
        
        cirlce_second_object.set_radius(100);
        System.out.println("The area for circle with raduis "+cirlce_second_object.radius+" is "+cirlce_second_object.get_area());
    }
    static class Circle{
    int radius;
    Circle(){
    radius=1;
    }
    Circle(int new_radius){
            radius=new_radius;
    }
    double get_area(){
            return Math.PI*radius*radius;
    }
    double get_perimeter(){
            return 2*Math.PI*radius;
    }
    void set_radius(int new_radius){
            radius=new_radius;
    }
    }
}
