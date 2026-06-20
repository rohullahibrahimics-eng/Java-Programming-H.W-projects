package chapter_10;

import java.util.Stack;

/**
 *
 * @author Mohammad Asif
 */
public class testStack {
    public static void main(String[] args) {
     Stack stack=new Stack();
     stack.push(12);
     stack.push(120);
     stack.push(13);
        System.out.println( stack.pop());
        System.out.println( stack.pop());
             stack.push(120);

        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack);
    }
    
    
}
