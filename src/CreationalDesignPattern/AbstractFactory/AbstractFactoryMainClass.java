package CreationalDesignPattern.AbstractFactory;

public class AbstractFactoryMainClass {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true);
        Profession profession = abstractFactory.getProfession("Engineer");
        profession.print();
    }
}
