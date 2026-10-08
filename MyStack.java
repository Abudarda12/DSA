
import java.util.*;

public class MyStack {

    static class StackB {

        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpaty() {
            return list.size() == 0;
        }

        //push
        public static void push(int data) {
            list.add(data);
        }

        //pop
        public static int pop() {
            if (isEmpaty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        //peak
        public static int peak() {
            if (isEmpaty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            return top;
        }
    }

    // creating stack using linkedList
    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }
    static class StackA{
        static Node head = null;
        public static boolean isEmpty(){
            return head == null;
        }
        //push newNode
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;

        }
        //pop 
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        //peak
        public static int peak(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            return top;
        }

    }

    public static void main(String[] args) {
        StackA s = new StackA();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.print(s.peak()+" ");
            s.pop();
        }


        

    }
}
