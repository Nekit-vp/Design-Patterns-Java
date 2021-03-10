package My;

public class Spoiler extends TuningDecorator {


    @Override
    public String getDescription() {
        return car.getDescription() + ", Spoiler";
    }

    @Override
    public int cost() {
        return car.cost() + 10000;
    }

    public Spoiler(Car car) {
        this.car = car;
    }
}
