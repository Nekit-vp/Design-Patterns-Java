package Strategy.bidlo;

public class MallardDuck extends Duck implements Flyable, Quackable {


    @Override
    public void display() {
        System.out.println("I'm a Mallard duck");
    }


    @Override
    public void fly() {
        System.out.println("I'm flying");
    }

    @Override
    public void quack() {
        System.out.println("кряяяяяяяяяяяя");
    }
}
