import java.util.*;

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

    //Pair of array
    public static void pairArr(int []arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                System.out.print("["+arr[i] + "," + arr[j] +"]");
            }
            System.out.println();
        }
    }

    //Subarrays
    public static void subArray(int []arr){
        
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int sum = 0;
                for(int k=i; k<= j; k++){
                    System.out.print(arr[k]+" ");
                    sum = sum + arr[k];
                }
                System.out.println("Sum of subarray: "+ sum);
                
            }
            System.out.println();
        }
        
    }
    //duplicate in Array 217
    public static boolean containsDuplicate(int[] nums){
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                return true;
            }else{
                hm.put(nums[i], i);
            }
        }
        return false;
    }

    //2d Array
    public static void twoDarr(int target){
        int arr[][] = new int[3][3];
        int row = arr.length; 
        int column = arr[0].length;
        
        Scanner sc = new Scanner(System.in);
        for(int i=0; i < row; i++){
           for(int j=0; j < column; j++){
            arr[i][j] = sc.nextInt();
           }
        }

        //output
        for(int i=0; i < row; i++){
            for(int j=0; j < column; j++){
                if(arr[i][j] == target){
                    System.out.println("found at "+ i +","+ j);
                    return;
                }else{
                    System.err.println("NOT FOUND");
                
                }
            }
           
        }

    }
    public static void main(String[] args) {
        int[] number = {2,3,4,10,6,8,2};
       twoDarr(7);
    }
}