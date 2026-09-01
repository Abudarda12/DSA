public class Array{

    //linear search
    public static void lineaSearch(int n){
        int[] arr = {1,2,3,5,4,6};
        
        for(int i = 0; i<arr.length; i++ ){
            if(n == arr[i]){
                System.out.print("index of target is: "+ i);
                return;
            }
            
        }
        System.out.println("Element is not present in array.");

    }

    //Largest of numbers in array
    public static int largestNum(int[] number){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
            if(smallest > number[i]){
                smallest = number[i];
            }
        }
        System.out.println("Smallest no. is: "+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int[] number = {2,3,4,10,6,8};
        int largest = largestNum(number);
        System.out.print(largest);
    }
}