public class Basic{

    //compress string
    public static String compressStr(String str){
        String newStr = "";
        for(int i = 0; i<str.length(); i++){
            Integer count = 1; 
            while(i < str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count>1){
                newStr += count;
            }
        }
        return newStr;
    }

    //compress throught string builder
    public static void compressSb(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i<str.length(); i++){
            int count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count);
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String str = "aabbbbudarda";
        compressSb(str);
    }
}