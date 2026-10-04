public class Oops{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blur");
        System.out.print(p1.color);
    }



}

class Pen{
    String color;
    int tip;

    void setColor(String setColor){
        color = setColor;
    }

    void setTip(int setTip){
        tip = setTip;
    }
}