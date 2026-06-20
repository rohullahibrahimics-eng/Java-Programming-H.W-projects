package excersise;
public class Excersise {
    Iparent ip1=new Iparent() {
        @Override
        public void showMessage2() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void showCall_record() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    };
    public static void main(String[] args) {
        Parent p=new Parent() {
            @Override
            void showMessage() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        
        Iparent ip=new Iparent() {
            @Override
            public void showMessage2() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void showCall_record() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
      
        
    }
}

abstract class Parent{
abstract void  showMessage();

}
class child_1 extends Parent implements Iparent{

    @Override
    void showMessage() {
        System.out.println("show_message of child-1");
    }

    @Override
    public void showCall_record() {
        System.out.println("show call_record interface");   
    }

    @Override
    public void showMessage2() {
        System.out.println("show message 2 interface");    
    }
        
}

interface Iparent{
        void showMessage2();
        void showCall_record();
}

 
    

