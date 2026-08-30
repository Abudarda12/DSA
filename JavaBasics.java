


public class JavaBasics {

    public static double  binaryToDec(int num){
      double dec = 0;
      int bin = num;
      int i = 0;
      while(bin > 0){
        int ld = bin%10;
        dec = dec + (ld*Math.pow(2, i));
        i++;
        bin = bin/10;
      }
      return dec;
    }

    //decimal to binary

    public static int decTobin(int num){
      int Dec = num;
      int i = 0;
      int bin = 0;
      while(Dec > 0){
          int ld = Dec%2;
          bin = bin + (ld*(int)Math.pow(10, i));
          i++;
          Dec = Dec/2;
      }
      return bin;
    }

    //check if palindrome
    public static void  checkPalindrome(int num){
      int n = num;
      int rev = 0;
       int i = 0;
      while(n>0){
       
        int ld = n % 10;
        rev = rev + ld*(int)Math.pow(10, i);
        i++;
        n = n / 10;
      }
      if(num == rev){
        System.out.print(num + " is a Palindrome");
      }else{
        System.out.print(num + " is a not Palindrome");
      }
    }
    public static void main(String[] args) {
      
      // for(int i = 1; i <= 5; i++){
      //   for(int j = 1; j <= i; j++){
      //     System.out.print(j);
      //   }
      //   for(int k = i-1; k >= 1; k--){
      //     System.out.print(k);
      //   }
      //   System.out.println();
      // }

      // for(int i = 5; i >= 1; i--){
      //   for(int j = 5; j >= i; j--){
      //     System.out.print(j);
      //   }
      //   for(int k = i+1; k <= 5; k++){
      //     System.out.print(k);
      //   }
      //   System.out.println();
      // }
      
      for(int i = 1; i <= 5; i++){
        for(int j = i; j >= 1; j--){
          System.out.print(j);
        }
        for(int k = 2; k <= i; k++){
          System.out.print(k);
        }
        System.out.println();
      }

    }

    
 
}
