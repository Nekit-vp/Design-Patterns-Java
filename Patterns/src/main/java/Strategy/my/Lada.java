package Strategy.my;

public class Lada extends Car {

    public Lada(){
        bipBehavior = new YesBip();
        roadBehavior  = new GoingOnland();
    }
    @Override
    public void display() {
        System.out.println("я лада русская машина, моя скорость: " + speed);
    }
}
