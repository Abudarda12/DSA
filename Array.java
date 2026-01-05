
public class Array {

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,9 };

        //int key = 3;
        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] == key){
        //         System.out.println("10 is at index:" + i);
        //     }
        // }
        //largestNum(arr);
        //System.out.print(binarySearch(arr, key));
        reverseArray(arr);
        
        for(int i = 0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }

    }

    //largest number
    public static void largestNum(int arr[]) {
        int num = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (num < arr[i]) {
                num = arr[i];
            }
        }
        System.out.println("largest num is : " + num);

    }

    //Binary Search
    public static int binarySearch(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    
    //Reverse an array
    public static void reverseArray(int arr[]) {
        int first = 0, last = arr.length-1;

        while(first <= last){
            int a = arr[first];
            arr[first] = arr[last];
            arr[last] = a;

            first++;
            last--;
        }
    }

}

