package Strategy.bidlo;

public class ModalDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display() {
        System.out.println("я модельная утка");
    }

    @Override
    public void fly() {
        System.out.println("Я не могу летать");
    }

    @Override
    public void quack() {
        System.out.println("криии");
    }
}
