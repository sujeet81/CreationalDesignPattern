package CreationalDesignPattern.AbstractFactory;

public class Engineer implements Profession{
    @Override
    public void print() {
        System.out.println("In a Print Of the Engineer Class");
    }
}
