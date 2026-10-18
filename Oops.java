public class Oops{
    public static void main(String[] args) {
      Fish tuna = new Fish();
      tuna.eat();
    }

}
class Animal{
    String name;
    String color;
    
    void eat(){
        System.out.print("Eats");
    }
    
}

class Fish extends Animal{
    int fins;
}
class BankAccount{
    public String name;
    private String password;
    void setPasswor(String newPassword){
        password = newPassword;
    }
    String getPassword(){
        return password;
    }

}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;

    }
    void setTip(int tip){
        this.tip = tip;
    }
}