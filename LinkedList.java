

public class LinkedList{
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addNode(int data){
        //create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //add to linked list
        newNode.next = head;
        //add to start
        head = newNode;

    }
    public void addLast(int data){
        //create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void  printLl(){
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    //add in the middle of node
    public void add(int index,int data){
        if(index == 0){
            addNode(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;

        int i=0;
        while(i < index-1){
           temp = head.next;
           i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    //search key in ll iterative
    public int searchLL(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    //search key in ll recursive
    public int helper(int key, Node head){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        
        int idx = helper(key, head.next);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int  searchRc(int key){
        return helper(key, head);
    }

    // reverse ll 
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    //delete nth node from last
    public void deleteNth(int n){
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        
        //delete 1st node from start
        if(n==sz){
            head = head.next;
            return;
        }
        //other node 1->2->3->4
        int i=0;
        int nth = sz - n;
        Node prev = head;
        while(i<nth){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;


    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(6);
        ll.addLast(3);
        ll.addLast(2);
        ll.add(0, 7);
        ll.printLl();
        //System.out.println(ll.size);
        ll.deleteNth(3);
        ll.printLl();


    }
}