package Strategy.book;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FluNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a modalDuck");
    }

}
