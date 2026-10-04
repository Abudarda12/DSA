public class Sorting{
    //bubble shorting
    public static void bubbleSort(int []number){
        int length = number.length;
        for(int i=0; i<length-1; i++){
           for(int j=0; j<length-1-i; j++){
            if(number[j]>number[j+1]){
                int temp = number[j];
                number[j] = number[j+1];
                number[j+1] = temp;
            }
           }
        }
        for(int i = 0; i<number.length; i++){
            System.out.print(number[i]+" ");
        }
    }

    //Selection sort
    public static void selectionSort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length-1; j++){
                if(arr[minPos]>arr[j]){
                    arr[minPos] = arr[j];
                }
            }

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }
    }
    public static void main(String[] args) {
        int[] number = {1,4,3,2,7,6,5};
        bubbleSort(number);
    }
}