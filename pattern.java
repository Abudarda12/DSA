public class pattern{

    //hollow rectangle
    public static void hollow_rectange(int rows, int cols){
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= cols; j++){
                if(i==1 || i == rows || j == 1 || j == cols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void rotatedPyramid(){
        for(int i = 1; i <= 4; i++ ){
            for(int j = 3; j >= i; j-- ){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //inverted pyramid with number
    public static void invertedPyramid(int n){
        for(int i = 0; i <= n; i++ ){
            for(int j = 1; j <= n-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }

    //floyd's triangle

    public static void floydTriangle(int n){
        int sum = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(sum+" ");
                sum++;
            }
            System.out.println();
        }
    }

    //0-1 triangle
    public static void zoroOneTriangle(int n){
        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i+j)%2 == 0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
                
            }
            System.out.println();
        }
    }

    // Butterfly Pattern
    public static void ButterflyPattern(){
        for(int i = 1; i <= 4; i++){
            for(int j=1; j <= i; j++){
                System.out.print("*");
            }
           for(int a = 1; a <= 2*(4-i); a++ ){
                System.out.print(" ");
            }
           for(int k = 1; k <= i; k++){
            System.out.print("*");
           }
            System.out.println();
        }
        for(int i = 4; i >= 1; i--){
            for(int j=1; j <= i; j++){
                System.out.print("*");
            }
           for(int a = 1; a <= 2*(4-i); a++ ){
                System.out.print(" ");
            }
           for(int k = 1; k <= i; k++){
            System.out.print("*");
           }
            System.out.println();
        }
    }

    //rhombus Patter
    public static void rhombusPattern(){
        for(int i = 1; i <= 5; i++){
            //spaces
            for(int j = 1; j <= 5-i; j++ ){
                System.out.print(" ");
            }
            //star
            for(int k = 1; k <= 5; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rhombusPattern();
    }
}