
import java.util.*;

public class StackA {
    // Push at bottom of stack
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
   
    //reverse a string
    public static String reverseStr(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder();
        while(!s.isEmpty()){
            char top = s.pop();
            result.append(top);
        }
        return result.toString();
    }
     //reverse a stack
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);

    }
    //print a stack
    public static void printStack(Stack s){
        
        while(!s.isEmpty()){
            System.out.print(s.pop());

        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(3);
        s.push(4);
        s.push(8);

        //pushAtBottom(s,4);

        
       //reverseStack(s);
       printStack(s);
    }
}
