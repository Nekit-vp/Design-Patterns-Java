package My;

public class Turbine extends TuningDecorator {

    @Override
    public String getDescription() {
        return car.getDescription() + ", Turbine";
    }

    @Override
    public int cost() {
        return car.cost() + 20000;
    }

    public Turbine(Car car) {
        this.car = car;
    }
}
