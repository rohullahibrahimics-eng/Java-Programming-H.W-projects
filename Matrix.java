package matrix;
import java.awt.*;
import javax.swing.*;
public class Matrix {
    
    JFrame fram=new JFrame();
    JPanel panelup=new JPanel();
    JLabel lbl_ask=new JLabel("Enter the matrix : ");
    JTextField txt_matrix=new JTextField();
    
    
 
   
    
    public Matrix(){
        
        fram.setSize(360, 580);
        fram.setLocation(500, 120);
        fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fram.setLayout(new BorderLayout());
        
        panelup.setBackground(Color.white);
        
        lbl_ask.setBackground(Color.GRAY);
        
        txt_matrix.setBackground(Color.red);
        txt_matrix.setColumns(20);
        
        
        
        panelup.add(lbl_ask,new FlowLayout());
        panelup.add(txt_matrix,new FlowLayout());
        
        
        fram.add(panelup,BorderLayout.NORTH);
}
    public static void main(String[] args) {
        new Matrix().fram.setVisible(true);
    }
    
}
