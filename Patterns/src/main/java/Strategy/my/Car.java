package Strategy.my;

public abstract class Car {

    BipBehavior bipBehavior;
    roadBehavior roadBehavior;

    public void performBip(){
        bipBehavior.bip();
    }

    public void performRoad(){
        roadBehavior.going();
    }

    public int speed;

    public Car(){
        speed = 0;
    }

    public abstract void display();

    public void go(){
        speed+= 30;
    }

    public void stop(){
        System.out.println("I'm a stop");
    }
}
