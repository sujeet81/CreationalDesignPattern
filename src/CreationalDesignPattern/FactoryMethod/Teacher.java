package CreationalDesignPattern.FactoryMethod;

public class Teacher implements Profession{

    @Override
    public void print() {
        System.out.println("In a Print of Teacher Class");
    }
}
