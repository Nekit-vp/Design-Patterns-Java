package Strategy.my;

public class AirPlan extends Car {

    public AirPlan(){
        bipBehavior = new InterestBip();
        roadBehavior = new GoingOnAir();
    }
    @Override
    public void display() {
        System.out.println("я дирижабль, моя скорость: " + speed);
    }
}
