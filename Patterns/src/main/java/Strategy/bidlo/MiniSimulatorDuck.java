package Strategy.bidlo;

public class MiniSimulatorDuck {
    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        mallard.display();
        mallard.swim();
        mallard.fly();
        mallard.quack();

        ModalDuck modalDuck = new ModalDuck();
        modalDuck.fly();
        modalDuck.quack();
    }
}
