package CreationalDesignPattern.SingeltonClass;

public class Main {
    public static void main(String[] args) {
        SingeltonClass singeltonObject = SingeltonClass.getInstance();
        singeltonObject.SimpleMethod();
        SingeltonClass singeltonObject2 = SingeltonClass.getInstance();
        singeltonObject.SimpleMethod();
    }
}
