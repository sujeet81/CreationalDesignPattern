package CreationalDesignPattern.AbstractFactory;

public class Teacher implements Profession {
    @Override
    public void print() {
        System.out.println("In a Print of the Teacher Class");
    }
}
