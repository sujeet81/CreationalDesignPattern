package CreationalDesignPattern.BuilderDesignPatter;

public class MainClass {

    public static void main(String[] args) {
        EarthQuakeResistantBuilder earthQuakeResistantBuilder = new EarthQuakeResistantBuilder();
        Director director = new Director(earthQuakeResistantBuilder);
        director.manageRequiredHomeConstruction();
        Home homeConstructedTheEnd = director.getComplexObjectOfHome();
        System.out.println(homeConstructedTheEnd);
        System.out.println(homeConstructedTheEnd.floor);
    }
}
