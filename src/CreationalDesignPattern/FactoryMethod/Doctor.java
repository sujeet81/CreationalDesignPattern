package CreationalDesignPattern.FactoryMethod;

public class Doctor implements Profession{
    @Override
    public void print() {
        System.out.println("In a Print of Doctor Class");
    }
}
