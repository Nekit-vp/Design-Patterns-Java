package Book;

public class Decaf extends Beverage{

    public Decaf() {
        description = "Without caffeine";
    }

    @Override
    public double cost() {
        return 0;
    }
}
