package Observer.bidlo;

public class CurrentConditionsDisplay {
    public void update(float t, float h, float p){
        System.out.println("Температура воздуха: " + t + ", влажность: " + h + ", давление: " + p);
    }
}
