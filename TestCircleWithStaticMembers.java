package testcirclewithstaticmembers;
public class TestCircleWithStaticMembers {
    public static void main(String[] args) {
        System.out.println("The numbe of objects is firstly "+circle.number_of_objects);
        circle c1=new circle(20);
        System.out.println("The radius is "+c1.getRadius());
        System.out.println("The numbe of objects is "+circle.number_of_objects);
        
        circle c2=new circle(50);
        System.out.println("The radius is "+c2.getRadius());
        System.out.println("The numbe of objects is "+circle.number_of_objects);
        circle[] cN=new circle [20];
        System.out.println("The numbe of objects is "+circle.number_of_objects);
        
        
        
        
    }
    
}

