package CreationalDesignPattern.PrototypePattern;

public class ProtoTypePatternMainClass {
    public static void main(String[] args) {
        ProfessionCache.loadProfessionCache();

        Profession docProfession = ProfessionCache.getCloneNewProfession(1);
        System.out.println(docProfession);

        Profession engineerProfession = ProfessionCache.getCloneNewProfession(2);
        System.out.println(engineerProfession);

        Profession teacherProfession = ProfessionCache.getCloneNewProfession(3);
        System.out.println(teacherProfession);
    }
}
