package Book;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL)
            cost += 0.10;
        else if (beverage.getSize() == Size.GRANDE)
            cost += 0.15;
        else if (beverage.getSize() == Size.VENTI)
            cost += 0.2;
        return cost;
    }
}
