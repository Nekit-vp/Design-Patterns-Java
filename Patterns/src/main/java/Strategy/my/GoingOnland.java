package Strategy.my;

public class GoingOnland implements roadBehavior {

    @Override
    public void going() {
        System.out.println("я еду по земле");
    }
}
