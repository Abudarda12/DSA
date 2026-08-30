public class Sorting{
    public static void main(String[] args){            
        int shortedArray[] = {1, 2, 3, 4, 6, 7, 8, 9};

        int start = 0;
        int end = shortedArray.length - 1;
        int missingTarget = 5;

       while(start <= end){
            int mid = start + (end - start) / 2;

            if(shortedArray[mid] == missingTarget){
                System.out.println("Target found at index: " + mid);
                return;
            } else if(shortedArray[mid] < missingTarget){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("Target found in the array at index: " + (start));
    }
}