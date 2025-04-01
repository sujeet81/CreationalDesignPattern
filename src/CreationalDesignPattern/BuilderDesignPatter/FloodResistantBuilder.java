package CreationalDesignPattern.BuilderDesignPatter;

public class FloodResistantBuilder implements  Builder{

    private Home floodResistantHome = new Home();

    @Override
    public void buildFloor() {
        floodResistantHome.floor = "10th feet above ground level floor ";
    }

    @Override
    public void buildWalls() {
        floodResistantHome.walls = "Water Resistant walls";
    }

    @Override
    public void buildTerrace() {
        floodResistantHome.terrace = "water leakage walls";

    }

    @Override
    public Home getComplexHomeObject() {
        return this.floodResistantHome;
    }
}
