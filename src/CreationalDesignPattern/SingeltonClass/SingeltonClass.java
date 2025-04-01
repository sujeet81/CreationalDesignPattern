package CreationalDesignPattern.SingeltonClass;

public class SingeltonClass {
    private static SingeltonClass singeltonInstance = new SingeltonClass();
    private SingeltonClass(){

    }
    public static SingeltonClass getInstance(){
        return singeltonInstance;
    }
    public void SimpleMethod(){
        System.out.println("hashCode of a Singelton Object " + singeltonInstance);
    }
}
