package CreationalDesignPattern.FactoryMethod;

public class FactoryMethodMainClass {
    public static void main(String[] args) {
        ProfessionalFactory professionalFactory = new ProfessionalFactory();
        Profession doc = professionalFactory.getProfession("Engineer");
        doc.print();
    }
}
