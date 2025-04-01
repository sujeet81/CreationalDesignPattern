package CreationalDesignPattern.AbstractFactory;

public class TraineeProfessionalAbstractFactory extends AbstractFactory {
    @Override
   public Profession getProfession(String typeOfProfession) {
        if(typeOfProfession == null){
            return null;
        }
        if(typeOfProfession.equalsIgnoreCase("TraineeEngineer")){
            return new TraineeEngineer();
        } else if (typeOfProfession.equalsIgnoreCase("TraineeTeacher")) {
            return new TraineeTeacher();
        }
        return null;
    }
}
