package Strategy.my;

public class MiniGameCar {
    public static void main(String[] args) {
        Car lada = new Lada();
        lada.display();
        lada.go();
        lada.go();
        lada.display();
        lada.performBip();
        lada.performRoad();

        Car airPlan = new AirPlan();
        airPlan.display();
        airPlan.go();
        airPlan.go();
        airPlan.go();
        airPlan.display();
        airPlan.performRoad();
        airPlan.performBip();
    }
}
