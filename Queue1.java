
import java.util.Queue;


public class Queue1 {

    // class QueueB {

    //     static int arr[];
    //     static int size;
    //     static int Rear = -1;

    //     QueueB(int n) {
    //         arr = new int[n];
    //         this.size = n;
    //     }

    //     //check if queue is empty
    //     public static boolean isEmpty() {
    //         if (Rear == -1) {
    //             System.out.println("Queue is Empty");
    //             return true;
    //         }
    //         return false;
    //     }

    //     //add in queue
    //     public static void add(int data) {
    //         if (Rear == size - 1) {
    //             System.out.println("Queue is full");
    //             return;
    //         }
    //         Rear++;
    //         arr[Rear] = data;

    //     }

    //     //dequeue in queue
    //     public static int remove() {
    //         if (isEmpty()) {
    //             System.out.println("Queue is empty");
    //             return -1;
    //         }
    //         for (int i = 0; i < Rear; i++) {
    //             arr[i] = arr[i + 1];
    //         }
    //         Rear--;
    //         return arr[0];
    //     }

    //     //peak in queue
    //     public static int peak() {
    //         if (isEmpty()) {
    //             System.out.println("Queue is empty");
    //             return -1;
    //         }
    //         return arr[0];

    //     }

    // }

    // static class Node {

    //     int data;
    //     Node next;

    //     public Node(int data) {
    //         this.data = data;
    //         this.next = null;
    //     }

    // }

    // static class QueueC {

    //     static Node Head = null;
    //     static Node Tail = null;
         

    //     //empty queue
    //     public static boolean isEmpty(){
    //         return Tail == null & Head == null;
    //     }

    //     //add element to the node
    //     static void add(int data){
    //         Node newNode = new Node(data);
    //         if(isEmpty()){
    //             Tail = Head = newNode;
    //             return;
    //         }
    //         Tail.next = newNode;
    //         Tail = newNode;
    //     }

    //     //dequeue 

    //     static int remove(){
    //         if(isEmpty()){
    //             System.out.println("Queue is empty");
    //             return-1;
    //         }
    //         int first = Head.data;
    //         if(Head == Tail){
    //             Tail = null;
    //         }
    //         Head = Head.next;
    //         return first;
    //     }
    //     //peek
    //     static int peek(){
    //         if(isEmpty()){
    //             System.out.println("Empty queue");
    //             return -1;
    //         }
    //         return Head.data;
    //     }
       

    // }

    public static void main(String[] args) {
        Queue<Integer> queue = new java.util.LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.poll();
        }

    }
}
