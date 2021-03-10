package Strategy.my;

public class GoingOnWater implements roadBehavior {
    @Override
    public void going() {
        System.out.println("Я еду по воде");
    }
}
