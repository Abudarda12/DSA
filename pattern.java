public class pattern{
    public static void main(String[] args) {
       
       // rotatedPyramidal();
        //nvertedNumPyramidal(5);
        //floydTriangle();
        //triangle01();
        //butterfly();
        solidRhombus();
    }
    
    //rotated pyramidal pattern
    public static void rotatedPyramidal (){
        int n = 4;
        //row 
        for(int i = 1; i<=n; i++){
            //spaces
            for(int j = n-1; j>=i; j--){
                System.out.print(" ");
            }
            //stars
            for(int k = 1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //pyramidal pattern
    public static void pyramidal(){
        int n = 4;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        } 
    }
    
    // inverted number wala pyramidal
    public static void invertedNumPyramidal(int n){
        for(int i = 1; i<=n; i++){
            for(int j=1; j<= (n-i+1); j++ ){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //floyd's triangle

    public static void floydTriangle(){
        int n = 5;
        int count = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" " + count);
                count++;
            }
            System.out.println();
        }
    }
    
    // 0-1 triangle 
    public static void triangle01(){
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i+j)%2 == 0){
                    System.out.print(" " + 1);
                }else{
                    System.out.print(" " + 0);
                }
            }
            System.out.println();
        }
    }

    //butterfly pattern
    public static void butterfly(){
        int n = 4;
        for(int i = 1; i<=n; i++){
            //star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //space
            for(int k = 1; k <= 2*(n-i); k++){
                System.out.print(" ");
            }
            //star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
            
        }

        for(int i = n; i >= 1; i--){
            //star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //space
            for(int k = 1; k <= 2*(n-i); k++){
                System.out.print(" ");
            }
            //star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        
    }

    //solid rhombus
    public static void solidRhombus(){
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= n; k++){
                System.out.print("*");
            }
            System.out.println();
        }
       
    }

    //hollow rhombus
    public static void hollowRhombus(){
        
    }
}