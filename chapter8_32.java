package chapter8;
public class chapter8_32 {
        public static void main(String[] args){
       double[][] points={{2, 2 },{4.5, 4.5},{6,6}};
         if(Double.isNaN(getTriangleArea(points))){
             System.out.println("The three points are on the same line");
         }
         else{
             System.out.println("The area of the triangle is "+getTriangleArea(points));
         }
        
    }
        public static double getTriangleArea(double [][] points){
            double p=0;
            for (int i = 0; i < edges(points).length; i++) {
                p+=edges(points)[i];
            }
            p=p/2;
            double area=Math.sqrt(p*(p-edges(points)[0])*(p-edges(points)[1])*(p-edges(points)[2]));
            return area;
            
        }
        
        public static double [] edges(double [][] points){
           double []  edge=new double[3];
                    edge[0]=Math.sqrt(Math.pow(points[1][0]-points[0][0], 2)+Math.pow(points[1][1]-points[0][1], 2));
                    edge[1]=Math.sqrt(Math.pow(points[2][0]-points[0][0], 2)+Math.pow(points[2][1]-points[0][1], 2));
                    edge[2]=Math.sqrt(Math.pow(points[2][0]-points[1][0], 2)+Math.pow(points[2][1]-points[1][1], 2));  
            return edge;
        }
    
}
