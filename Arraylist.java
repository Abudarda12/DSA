import java.util.ArrayList;

public class Arraylist{
    public static void main(String []args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(91);
        list.add(43);
        System.out.println(list);
        int temp = list.get(0);
        list.set(0, list.get(2));
        list.set(2, temp);
        System.out.println(list);

        Arraylist<Arraylist<Integer>> list1 = new Arraylist<>();
    }
}