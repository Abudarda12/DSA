
public class Array {

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};

        //int key = 3;
        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] == key){
        //         System.out.println("10 is at index:" + i);
        //     }
        // }
        //largestNum(arr);
        //System.out.print(binarySearch(arr, key));
        //reverseArray(arr);
        // for(int i = 0; i<arr.length; i++){
        //     System.out.print(" "+arr[i]);
        // }
        //pairs(arr);
        //subArrays(arr);
        // maxSubArray(arr);

        sumSubPrefix(arr);

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
        int first = 0, last = arr.length - 1;

        while (first <= last) {
            int a = arr[first];
            arr[first] = arr[last];
            arr[last] = a;

            first++;
            last--;
        }
    }

    //pairs of an array
    public static void pairs(int arr[]) {
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total no of pair: " + tp);
    }

    //print subarrays
    public static void subArrays(int arr[]) {
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print(ts);
    }

    //maximum Subarrays Sum
    public static void maxSubArray(int arr[]) {
        int Max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;

            for (int j = i; j < arr.length; j++) {
                int end = j;
                int curr = 0;

                for (int k = start; k <= end; k++) {
                    curr = curr + arr[k];
                }
                System.out.println(curr);

                if (Max < curr) {
                    Max = curr;
                }
            }

        }
        System.out.print(Max);
    }

    // maximum subarray sum by prefix array
    public static void sumSubPrefix(int arr[]){
        int max =Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
         
         int currSum=0;

         prefix[0]=arr[0];

         for(int i=1 ; i<arr.length ; i ++){
            prefix[i] = prefix[i-1]+arr[i];
         }

        for(int i=0 ; i<arr.length ; i++){
            int start=i;

            for( int j=i ; j< arr.length ; j++){
                int end=j;

                currSum=start==0 ? prefix[end]:prefix[end]-prefix[start-i];

                if(max<currSum){
                    max=currSum;
                }


            }
        }
        System.out.println(max);
    }


}
