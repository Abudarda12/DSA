public class Oops{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.print("Color of Pen is "+p1.color);

        p1.setTip(5);
        System.out.print(" and tip is "+p1.tip+"mm");

    }

}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;

    }
    void setTip(int newTip){
        tip = newTip;
    }
}