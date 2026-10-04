public class Recursion{
    public static void main(String[] args) {
        int number[] = {1,5,3,7,3,2,2};
        System.out.println(xpn(2, 11));
        
    }
    //calculate x^n 
    public static int xpn(int x, int n){
        if(n==0){
            return 1;
        }

        int powerEven = xpn(x, n/2) *xpn(x, n/2);

        if(n%2 != 0){
            powerEven = x*powerEven;
        }
        return powerEven;
    }

    //return last occurence
    public static int lastOccurence(int arr[],int key,int i){
        if(i < 0){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return lastOccurence(arr, key, i-1);
    }
    //return first occurance 
    public static int firtOccurance(int []arr, int key, int i){
        if( i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firtOccurance(arr, key, i+1);
    }
    //check if sorted or not
    public static boolean sortedOrNot(int[] arr,int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] >= arr[i+1]){
            return false;
        }
        return sortedOrNot(arr, i+1);
        
    }
   
   //print decreasing number from n
   public static void printNum(int n) {
       if(n == 1){
        System.out.print(n);
        return;
       }else{
        System.out.print(n+" ");
        printNum(n-1);
       }
   }

    public static void printWord(int n){
       if(n<=0){
        return ;
       }else{
        String number[] = {"zero","one","two","three","four","five","Six","seven","eight","nine"};
        int rn = n%10;
        System.out.print(number[rn]+" ");
        printWord(n/10);
       }
    }
}