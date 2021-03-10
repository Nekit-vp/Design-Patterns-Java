package My;

public class Injection extends TuningDecorator {
    @Override
    public String getDescription() {
        return car.getDescription() + ", Injection";
    }

    @Override
    public int cost() {
        return car.cost() + 60000;
    }

    public Injection(Car car) {
        this.car = car;
    }
}
