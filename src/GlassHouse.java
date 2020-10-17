public class GlassHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        System.out.println("Building Glass Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with glass coating");
    }
    
    // added new method for roofing; by usnabeel1
    @override
    public void buildroofs(){
        System.out.println("Building glass roofing")
    }
}
