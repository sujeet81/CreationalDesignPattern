package CreationalDesignPattern.AbstractFactory;

public class ProfessionAbstractFactory extends AbstractFactory {
    @Override
    public Profession getProfession(String typeOfProfession) {
        if(typeOfProfession == null){
            return null;
        }
        if(typeOfProfession.equalsIgnoreCase("Engineer")){
            return new Engineer();
        } else if (typeOfProfession.equalsIgnoreCase("Teacher")) {
            return new Engineer();

        }
        return null;
    }
}
