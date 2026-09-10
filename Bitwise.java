public class Bitwise{

    //odd or even
    public static void oddEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        oddEven(190);
    }
}