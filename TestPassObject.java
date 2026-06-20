package testcirclewithprivatedatafields;
public class TestPassObject {
           public static void main(String[] args){
               test_citcle c1=new test_citcle();
               System.out.println("The radius  "+" the area");
               test_passing_an_object_to_a_method(c1, 10);
           }
           public static void test_passing_an_object_to_a_method(test_citcle c, int times ){
              while(times>=1){
                 System.out.println("the area for "+c.get_radius()+" radius is "+c.get_area());
                  times--;
              }
               
           }
}
