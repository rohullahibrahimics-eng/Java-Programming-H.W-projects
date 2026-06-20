package chapter8;
public class chapter8_7 {
    public static void main(String [] args){
            double [][] points={{-1,0,3},{-1,-1,-1},{4,1,1},{2, 0.5,9},{3.5,2,-1},{3, 1.5, 3},{-1.5, 4 , 2}};
            double result=0;
            double minumum=1000000000;
            double[][] min_points=new double[2][3];
            for (int i = 0; i <points.length; i++) {
                for (int j = i+1; j < points.length; j++) {
                    result=Math.pow(    Math.pow(points[j][0]-points[i][0],2)+Math.pow(points[j][1]-points[i][1],2)  + Math.pow(points[j][2]-points[i][2],2)  , 0.5    );
                    if(result<minumum){
                    min_points[0][0]=points[i][0];
                    min_points[0][1]=points[i][1];
                    min_points[0][2]=points[i][2];
                    min_points[1][0]=points[j][0];
                    min_points[1][1]=points[j][1];
                    min_points[1][2]=points[j][2];
                        minumum=result;
                    }
                }
           
        }
             System.out.println("The nearest points are ( "+ min_points[0][0]+" , "+min_points[0][1]+"  , "+min_points[0][2]+" ) and ( "+ min_points[1][0]+" , "+min_points[1][1]+"  , "+min_points[1][2]+" ) ");
                System.out.println("Nearest  point is "+minumum);
    }
}
