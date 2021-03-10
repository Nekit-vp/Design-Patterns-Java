package My;

public class Lada extends Car {

    public Lada() {
        description = "Lada";
    }

    @Override
    public int cost() {
        return 150000;
    }
}
